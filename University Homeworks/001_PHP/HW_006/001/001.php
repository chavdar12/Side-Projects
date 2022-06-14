<?php
$file = fopen("data.txt", 'wb') or die("Неуспешно отваряне на файл!");
$txt = "Дисциплина Web приложения се изучава през втория семестър на втори курс. \nТази дисциплина се изучава от студенти, които са специалност СИТ.\n";
fwrite($file, $txt);
fclose($file);

$file = fopen("data.txt", 'ab') or die("Неуспешно отваряне на файл!");
$txt = "Студентите редовно си пишат домашните.\n";
fwrite($file, $txt);
fclose($file);

$content = file_get_contents('data.txt');
print("Съдържание на файл data.txt с размер: " . filesize("data.txt") . " байта <br>");
print($content);