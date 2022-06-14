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
$num = 1;
print("<ul>");
for ($i = 1; $i <= 10; $i++) {
    print("<li>X = $num </li><br>");
    print("<ul>");
    print("<li>    X ^ 3 = " . ($num ** 3) . "</li><br>");
    print("</ul>");
    $num++;
}
echo "</ul>";
?>
</body>
</html>