<?php
require_once "session_bootstrap.php";
if (!isset($_SESSION['username']) || $_SESSION['role'] !== 'admin') {
    header('Location: login.php');
    exit;
}
?>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Panel</title>
    <link rel="stylesheet" href="style.css">
    <style>
        .navbar { background: #e6a04b; padding: 15px; color: white; display: flex; justify-content: space-between; }
        .container { padding: 40px; }
        .card { background:white; padding:20px; border-radius:10px; box-shadow:0 5px 15px rgba(0,0,0,0.1); }
    </style>
</head>
<body>
<div class="navbar">
    <div>Admin Panel</div>
    <div><a href="dashboard.php">Back</a> | <a href="logout.php">Logout</a></div>
</div>
<div class="container">
    <div class="card">
        <h2>Administrator Functions</h2>
        <p>As the site owner you can manage users, tournaments, and access everything.</p>
        <ul>
            <li><a href="browse_tournaments.php">View All Tournaments</a></li>
            <li><a href="create_tournament.php">Create Tournament</a></li>
            <!-- add more admin options here -->
        </ul>
    </div>
</div>
</body>
</html>

