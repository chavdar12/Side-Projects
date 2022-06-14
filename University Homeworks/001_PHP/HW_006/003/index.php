<?php
include 'function.php';

$file = fopen("data.txt", 'wb') or die("Неуспешно отваряне на файл!");
$txt = "10,35,30,44,55,14,73";
fwrite($file, $txt);
fclose($file);


$fileContent = file_get_contents('data.txt');
echo "Съдържание на файл data.txt с размер: " . filesize("data.txt") . " байта <br>";
echo $fileContent;

$array = [];
print("<br>");
print(explode(",", $txt));
print("<br>");