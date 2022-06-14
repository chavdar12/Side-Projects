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
echo "<table border = 4>";
for ($i = 1; $i <= 7; $i++) {
    print("<tr>");
    for ($j = 1; $j <= 7; $j++) {
        print("<td>");
        if ($j <= 7) {
            $num = $i * $j;
            print("<tr><td> $num </td></tr>");
        } else {
            $num2 = $i * $j;
            print("<tr><td> $num2 </td></tr>");
        }
    }

}
?>
</body>
</html>