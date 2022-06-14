<?php
$array5 = [];
foreach ($array as $k => $kValue) {
    if ($kValue % 5 == 0) {
        $array5[] = $kValue;
    }
}

function noNULLvalues($var)
{
    return $var != NULL && $var != "";
}

$filter = array_filter($array5, "noNULLvalues");
print("<br>Кратни на 5 числа: ");
print_r($filter);

print("<br> Произведение = " . array_product($array5));
print("<br><br>'отпечатва елементите на масива, които са по-големи от своите съседи'<br><br>");

for ($j = 0, $jMax = count($array5); $j < $jMax; $j++) {
    if ($array5[$j] > $array5[$j + 1] && $array5[$j] > $array5[$j - 1]) {
        print("<br>$array5[$j]");
    }
}
