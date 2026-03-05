<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "user_system";

// secret string to allow admin creation during registration
$admin_secret = 'school_organizer_admin_2026';

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
?>
