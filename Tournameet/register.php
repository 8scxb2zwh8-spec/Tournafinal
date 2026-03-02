<?php
// ============================================================
//  POST /api/register.php
//  Body (JSON): { "tournament_id": 1, "name": "...", "email": "..." }
// ============================================================

require_once 'config.php';

if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
    jsonResponse(['error' => 'Method not allowed'], 405);
}

// Parse JSON body
$body          = json_decode(file_get_contents('php://input'), true);
$tournament_id = intval($body['tournament_id'] ?? 0);
$name          = trim($body['name']  ?? '');
$email         = trim($body['email'] ?? '');

// Basic validation
if ($tournament_id <= 0) {
    jsonResponse(['error' => 'Invalid tournament ID'], 400);
}
if ($name === '') {
    jsonResponse(['error' => 'Name is required'], 400);
}
if ($email === '' || !filter_var($email, FILTER_VALIDATE_EMAIL)) {
    jsonResponse(['error' => 'A valid email address is required'], 400);
}

$conn = getConnection();

// ── Begin transaction ────────────────────────────────────────
$conn->begin_transaction();

try {
    // Lock the tournament row and check slot availability
    $check = $conn->prepare("
        SELECT slots_total, slots_taken
        FROM tournaments
        WHERE id = ? AND is_active = 1
        FOR UPDATE
    ");
    $check->bind_param('i', $tournament_id);
    $check->execute();
    $result = $check->get_result();
    $t      = $result->fetch_assoc();
    $check->close();

    if (!$t) {
        throw new Exception('Tournament not found', 404);
    }
    if ($t['slots_taken'] >= $t['slots_total']) {
        throw new Exception('Tournament is already full', 409);
    }

    // Insert registration
    $ins = $conn->prepare("
        INSERT INTO registrations (tournament_id, participant_name, participant_email)
        VALUES (?, ?, ?)
    ");
    $ins->bind_param('iss', $tournament_id, $name, $email);
    $ins->execute();
    $ins->close();

    // Increment slots_taken
    $upd = $conn->prepare("
        UPDATE tournaments
        SET slots_taken = slots_taken + 1
        WHERE id = ? AND slots_taken < slots_total
    ");
    $upd->bind_param('i', $tournament_id);
    $upd->execute();
    $upd->close();

    $conn->commit();
    $conn->close();

    jsonResponse(['success' => true, 'message' => 'Registered successfully']);

} catch (Exception $e) {
    $conn->rollback();
    $conn->close();
    $code = $e->getCode() ?: 500;
    jsonResponse(['error' => $e->getMessage()], $code);
}