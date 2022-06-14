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
    <a>Enter a number:</a>
    <label>
        <input type="number" name="num"/>
    </label>
    <br/>
    <input type="submit" name="submit" value="GO"/>
</form>

<?php
if (isset($_POST['submit'])) {
    function prime($a)
    {
        if ($a == 1) {
            return 0;
        }
        for ($i = 2; $i <= $a / 2; $i++) {
            if ($i % $a == 0) {
                return 0;
            }
        }
        return 1;
    }

    $a = $_POST['a'];
    $check = prime($a);
    if ($check == 1) {
        print("$a is simple");
    } else {
        print("$a is not simple");
    }
}
?>
</body>
</html>