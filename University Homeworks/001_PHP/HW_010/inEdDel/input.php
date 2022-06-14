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
<h2>Create a book</h2>
<form method="post">
    <label for="title">Title:</label>
    <br>
    <input type="text" id="title" name="title">
    <br>
    <label for="author">Author:</label><br>
    <input type="text" id="author" name="author">
    <br>
    <label for="publisher">Publisher:</label>
    <br>
    <input type="text" id="publisher" name="publisher">
    <br>
    <label for="year">Publishing year:</label>
    <br>
    <input type="text" id="year" name="year">
    <br>
    <input type="submit" name="submit" value="Въведи"/>
</form>
<?php
include '../dbFiles/config.php';

if (isset($_POST['submit'])) {

    $title = $_POST['title'];
    $author = $_POST['author'];
    $publisher = $_POST['publisher'];
    $year = $_POST['year'];

    if (!empty($title) && !empty($author) && !empty($publisher) && !empty($year)) {
        $sql = "INSERT INTO book (title, author, publisher, year) VALUES ('$title', '$author', '$publisher', '$year')";
        $result = mysqli_query($dbConn, $sql);
        if (!$result) {
            die('<br> Error');
        }

        print("<br> Add record");
    } else {
        print("<br> empty part");
    }
}
?>
</body>
</html>