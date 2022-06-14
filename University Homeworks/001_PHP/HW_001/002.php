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
    <a>Enter the first number:</a>
    <br/>
    <label>
        <input type="number" name="num1"/>
    </label>
    <br/>
    <a>Enter the second number:</a>
    <br/>
    <label>
        <input type="number" name="num2"/>
    </label>
    <input type="submit" name="submit" value="Submit"/>
</FORM>
<?php
if (isset($_POST['submit'])) {
    $num1 = $_POST['num1'];
    $num2 = $_POST['num2'];
    echo "Първото число е: $num1 второто число е: $num2";
}
?>
</body>
</html>