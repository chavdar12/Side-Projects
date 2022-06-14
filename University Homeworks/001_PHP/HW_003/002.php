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
$num = 0;
while ($num < 9) {
    print("abc ");
    $num++;
}

$num2 = 0;
do {
    print("xyz ");
    $num2++;
} while ($num2 < 9);

for ($i = 1; $i <= 9; $i++) {
    echo "$i ";
}

$items = array(1 => "Item A", 2 => "Item B", 3 => "Item C", 4 => "Item D", 5 => "Item E", 6 => "Item F");
$count = 1;
foreach ($items as $value) {
    print("$count. $value <br>");
    $count++;
}
?>
</body>
</html>