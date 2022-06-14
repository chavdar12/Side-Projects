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
<FORM name="form" method="post" action="#">
    <a>Please enter your information:</a>
    <br>
    <a>Your name:</a>
    <label>
        <input type="text" name="name"/>
    </label><br><br>
    <br>
    <a>Your age:</a>
    <label>
        <input type="number" name="age"/>
    </label><br><br>
    <input type="submit" name="submit" value="Изпрати!"/>
</FORM>
<?php
if (isset($_POST['submit'])) {
    $name = $_POST['name'];
    $age = $_POST['age'];

    print("Hello, $name !<br>");
    print ("You are $age years old");
}
?>
</body>
</html>