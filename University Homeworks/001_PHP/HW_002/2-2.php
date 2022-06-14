<html><head>
    <title>20621620</title>
</head>
<body>
<FORM name="form" method="post" action="#" >
    Find solution for ax^2 + bx + c <br/>
    a:
    <input type="number" name="a"/> <br/>
    b:
    <input type="number" name="b"/> <br/>
    c:
    <input type="number" name="c"/>
    <input type="submit" name="submit" value="Find x" />
</FORM>
<?php
if (isset($_POST['submit']))
{
   $a = $_POST['a'];
   $b = $_POST['b'];
   $c = $_POST['c'];
   
    $d = $b * $b - 4 * $a * $c;

if ($d > 0) {
    $x1 = (-$b + sqrt($d)) / (2 * $a);
    $x2 = (-$b - sqrt($d)) / (2 * $a);
    echo "x1 = ", number_format($x1,3), " <br> x2 = ", number_format($x2,3);
} else if ($d == 0) {
    $x1 = -$b / (2 * $a);
    echo "\n\nThe r1 = r2 = ", number_format($x,3), ";\n";
} else {
    echo "No real solutions";
}
}
?>
</body></html>