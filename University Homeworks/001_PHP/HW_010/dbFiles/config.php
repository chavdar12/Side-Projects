<?php
$host = 'localhost';
$dbUser = 'root';
$dbPass = '';
$dbName = 'books_info';
$dbConn = mysqli_connect($host, $dbUser, $dbPass);

if (!$dbConn = mysqli_connect($host, $dbUser, $dbPass)) {
    die('No connection');
}

if (!mysqli_select_db($dbConn, $dbName)) {
    die('Selection error');
}
mysqli_query($dbConn, "SET NAMES 'UTF8'");
