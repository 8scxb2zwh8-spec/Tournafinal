<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="style.css">
    <style>
        .register-card {
            width: 430px;
            padding: 28px;
        }
        .register-card .input-group {
            margin-bottom: 11px;
        }
        .register-card h2 {
            margin-bottom: 14px;
        }
    </style>
</head>
<body class="form-body">

<div class="card register-card">
    <h2>Create Account</h2>

    <form action="register_process.php" method="POST">

        <div class="input-group">
            <label>Username</label>
            <input type="text" name="username" required>
        </div>

        <div class="input-group">
            <label>Email</label>
            <input type="email" name="email" required>
        </div>

        <div class="input-group">
            <label>Password</label>
            <input type="password" name="password" required>
        </div>

        <div class="input-group">
            <label>Role</label>
            <select name="role" required>
                <option value="athlete" selected>Athlete</option>
                <option value="organizer">Organizer</option>
                <option value="admin">Administrator</option>
            </select>
        </div>
        <div class="input-group">
            <label>Admin Code (if registering as admin)</label>
            <input type="text" name="admin_code" placeholder="enter secret code">
        </div>

        <button type="submit" class="form-btn">Register</button>

    </form>

    <div class="link">
        Already have an account? <a href="login.php">Login here</a>
    </div>
</div>

</body>
</html>
