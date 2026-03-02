<?php
// ============================================================
//  GET /api/tournaments.php
//  Query params:
//    ?search=keyword
//    ?sort=az|za|newest|slots
// ============================================================

require_once 'config.php';

if ($_SERVER['REQUEST_METHOD'] !== 'GET') {
    jsonResponse(['error' => 'Method not allowed'], 405);
}

$conn   = getConnection();
$search = trim($_GET['search'] ?? '');
$sort   = trim($_GET['sort']   ?? '');

// ── Base SELECT ──────────────────────────────────────────────
$sql = "
    SELECT
        t.id,
        t.name,
        s.name                                  AS sport,
        o.name                                  AS organizer,
        t.location,
        DATE_FORMAT(t.date, '%Y-%m-%d')         AS date,
        TIME_FORMAT(t.start_time, '%h:%i %p')   AS time,
        t.slots_total,
        t.slots_taken,
        t.prize,
        t.entry_fee,
        t.format,
        t.description,
        t.image_url
    FROM tournaments t
    JOIN sports     s ON s.id = t.sport_id
    JOIN organizers o ON o.id = t.organizer_id
    WHERE t.is_active = 1
";

$params = [];
$types  = '';

// ── Search filter ────────────────────────────────────────────
if ($search !== '') {
    $sql     .= " AND (t.name LIKE ? OR s.name LIKE ? OR t.location LIKE ?)";
    $like     = '%' . $search . '%';
    $params[] = $like;
    $params[] = $like;
    $params[] = $like;
    $types   .= 'sss';
}

// ── Sort order ───────────────────────────────────────────────
$orderMap = [
    'az'     => 'ORDER BY t.name ASC',
    'za'     => 'ORDER BY t.name DESC',
    'newest' => 'ORDER BY t.date DESC',
    'slots'  => 'ORDER BY (t.slots_total - t.slots_taken) DESC',
];
$sql .= ' ' . ($orderMap[$sort] ?? 'ORDER BY t.date ASC');

// ── Execute ──────────────────────────────────────────────────
$stmt = $conn->prepare($sql);

if (!empty($params)) {
    $stmt->bind_param($types, ...$params);
}

$stmt->execute();
$result = $stmt->get_result();

$rows = [];
while ($row = $result->fetch_assoc()) {
    $rows[] = $row;
}

$stmt->close();
$conn->close();

jsonResponse(['data' => $rows]);