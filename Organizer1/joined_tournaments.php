<?php
require_once "session_bootstrap.php";
if (!isset($_SESSION['username']) || !in_array($_SESSION['role'], ['athlete','admin'])) {
    header('Location: login.php');
    exit;
}
include "config.php";
require_once "organizer_helpers.php";

ensureOrganizerSchema($conn);

$username = $_SESSION['username'];
$stmt = $conn->prepare("SELECT tr.joined_at, tr.team_name, tr.members, tr.status, tr.attendance_status, t.*
        FROM tournament_registrations tr
        INNER JOIN tournaments t ON t.id = tr.tournament_id
        WHERE tr.athlete_username = ?
        ORDER BY t.event_date ASC, t.event_time ASC, tr.joined_at DESC");
$stmt->bind_param("s", $username);
$stmt->execute();
$result = $stmt->get_result();
$joined = $result && $result->num_rows > 0;
?>
<!DOCTYPE html>
<html>
<head>
    <title>My Joined Tournaments</title>
    <link rel="stylesheet" href="style.css">
    <style>
        .container { padding: 40px; max-width: 1100px; margin: 0 auto; }
        .header-card, .joined-card, .empty { background:#fff; padding:18px 20px; border-radius:10px; box-shadow:0 5px 15px rgba(0,0,0,0.08); }
        .header-card { margin-bottom:18px; }
        .joined-card { margin-bottom:14px; display:flex; justify-content:space-between; gap:16px; align-items:center; }
        .joined-card h3 { margin: 0 0 8px; }
        .joined-card p { margin: 4px 0; }
        .status { display:inline-block; padding:6px 10px; border-radius:999px; font-weight:700; font-size:12px; margin-bottom:8px; text-transform:uppercase; }
        .status.approved { background:#e7f8ed; color:#176e3b; }
        .status.pending { background:#fff4de; color:#7f5300; }
        .status.rejected { background:#fdecec; color:#8f2929; }
        .status.waitlisted { background:#e9eeff; color:#3456a5; }
        .actions a { background:#e6a04b; color:#fff; text-decoration:none; padding:9px 12px; border-radius:8px; font-weight:700; display:inline-block; }
        .muted { color:#5f6775; }
        @media (max-width: 760px) { .joined-card { flex-direction: column; align-items: flex-start; } }
    </style>
</head>
<body>
<div class="navbar">
    <div>My Joined Tournaments</div>
    <div><a href="dashboard.php">Back</a> | <a href="logout.php">Logout</a></div>
</div>

<div class="container">
    <div class="header-card">
        <strong><?php echo htmlspecialchars($_SESSION['username']); ?></strong>
        <span class="muted"> - Joined tournaments overview</span>
    </div>

    <?php if (!$joined): ?>
        <div class="empty">
            <p>You have not joined any tournament yet.</p>
            <p><a href="browse_tournaments.php" class="btn">Browse Tournaments</a></p>
        </div>
    <?php else: ?>
        <?php while($row = $result->fetch_assoc()): ?>
            <div class="joined-card">
                <div>
                    <span class="status <?php echo htmlspecialchars($row['status']); ?>"><?php echo htmlspecialchars($row['status']); ?></span>
                    <h3><?php echo htmlspecialchars($row['title']); ?></h3>
                    <p><strong>Date:</strong> <?php echo htmlspecialchars($row['event_date']); ?> <?php if (!empty($row['event_time'])): ?>at <?php echo htmlspecialchars(date('g:i A', strtotime($row['event_time']))); ?><?php endif; ?></p>
                    <p><strong>Venue:</strong> <?php echo htmlspecialchars($row['location'] ?: 'TBA'); ?></p>
                    <p><strong>Attendance:</strong> <?php echo htmlspecialchars($row['attendance_status'] ?: 'unknown'); ?></p>
                    <p class="muted"><strong>Joined On:</strong> <?php echo htmlspecialchars($row['joined_at']); ?></p>
                    <?php if (!empty(trim($row['team_name'] ?? ''))): ?><p><strong>Team Name:</strong> <?php echo htmlspecialchars($row['team_name']); ?></p><?php endif; ?>
                </div>
                <div class="actions">
                    <a href="payment.php?id=<?php echo intval($row['id']); ?>">View Details</a>
                </div>
            </div>
        <?php endwhile; ?>
    <?php endif; ?>
</div>
</body>
</html>

