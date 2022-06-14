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
<form name="form" method="post" action="#">
    <a>First name</a>
    <br>
    <label>
        <input type=text name="first_name">
    </label>
    <br>
    <a>Last name</a>
    <br>
    <label>
        <input type=text name="last_name">
    </label>
    <br>
    <a>Email</a>
    <br>
    <label>
        <input type=email name="email">
    </label>
    <br>
    <input type=submit name="submit" value="Create and show">
    <br>
</form>
<?php
include 'Person.php';

if (isset($_POST['submit']) and isset($_POST['first_name']) and isset($_POST['last_name']) and isset($_POST['email'])) {
    $first_name = $_POST['first_name'];
    $last_name = $_POST['last_name'];
    $email = $_POST['email'];

    $per = new Human($first_name, $last_name, $email);
    echo $per->show_person();

}
?>
</body>
</html>