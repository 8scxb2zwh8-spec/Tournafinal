<?php
// ============================================================
//  GET /api/tournament.php?id=1
//  Returns a single tournament with full details
// ============================================================

require_once 'config.php';

if ($_SERVER['REQUEST_METHOD'] !== 'GET') {
    jsonResponse(['error' => 'Method not allowed'], 405);
}

$id = intval($_GET['id'] ?? 0);
if ($id <= 0) {
    jsonResponse(['error' => 'Invalid or missing tournament ID'], 400);
}

$conn = getConnection();

$stmt = $conn->prepare("
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
    WHERE t.id = ? AND t.is_active = 1
    LIMIT 1
");

$stmt->bind_param('i', $id);
$stmt->execute();
$result = $stmt->get_result();
$row    = $result->fetch_assoc();

$stmt->close();
$conn->close();

if (!$row) {
    jsonResponse(['error' => 'Tournament not found'], 404);
}

jsonResponse(['data' => $row]);