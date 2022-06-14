<?php
$conn = new mysqli('localhost', 'root', '');

if ($conn->connect_error) {
    die('<br>Грешка: ' . $conn->connect_error);
}

$sql = "CREATE DATABASE books_info";

if ($conn->query($sql) == TRUE) {
    print("<br>Connected<br>");
} else {
    print(sprintf("<br>Connection error%s", $conn->error));
}

$sql = "CREATE TABLE infobooks.book (
id INT(5) NOT NULL AUTO_INCREMENT , 
title VARCHAR(30) NOT NULL , 
author VARCHAR(30) NOT NULL ,
publisher VARCHAR(30) NOT NULL , 
year INT(5) NOT NULL ,
PRIMARY KEY (`id`))";


if ($conn->query($sql) == TRUE) {
    print('<br>Created');
} else {
    print(sprintf("<br>Error %s", $conn->error));
}
$conn->close();
