<?php
if (isset($_POST['submit'])) {
    $a = $_POST['a'];
    $b = $_POST['b'];
    $c = $_POST['c'];

    if ($a == $b && $b == $c) {
        print('The triangle is ravnostranen<br>');
    } else if ($a == $b || $a == $c || $b == $c) {
        print('The triangle is ravnobedren<br>');
    } else {
        print("The triangle is raznostranen<br>");
    }
    $p = ($a + $b + $c) / 2;
    $area = sqrt($p * ($p - $a) * ($p - $b) * ($p - $c));

    print('Area of the triangle is $s cm^2');
}