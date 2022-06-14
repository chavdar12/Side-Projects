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
    <br/>
    <a>Enter a number:</a>
    <label>
        <input type="number" name="num"/>
    </label>
    <br/>
    <input type="submit" name="submit" value="GO"/>
</form>

<?php
if (isset($_POST['submit'])) {
    $a = $_POST['a'];

    $sum = 0;
    $sum1 = 0;
    $start = 1;
    $end = 100;
    while ($a != 0) {
        $sum = $sum + $a % 10;
        $a /= 10;
    }
    for ($i = $start; $i <= $end; $i++) {
        $sum1 += $i;
    }
    print("Sum of numbers of $a equals to $sum <br>");
    print("Sum from 1 to 100 is $sum1<br>");
}
?>
</body>
</html>