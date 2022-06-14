<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<?php
if (isset($_COOKIE['user'])) {
    print("Welcome " . $_COOKIE['user'] . "!<br>");
} else {
    print("No existing cookies<br>");
}

print("All cookies: <br>");
print_r($_COOKIE);
?>
<a href="last.php">Next page - delete cookie </a>
</body>
</html>