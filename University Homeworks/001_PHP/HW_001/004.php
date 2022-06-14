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
<FORM name="form" method="post">
    <a>Please enter your name:</a>
    <br/>
    <label>
        <input type="text" name="name"/>
    </label>
    <input type="submit" name="submit" value="Go"/>
</FORM>
<?php
if (isset($_POST['submit'])) {
    $name = $_POST['name'];
    print("Your name is $name");
}
?>
</body>
</html>