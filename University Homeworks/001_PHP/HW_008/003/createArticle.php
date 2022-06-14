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
<form name="form" method="post">
    <a>Title</a>
    <br>
    <label>
        <input type=text name="titl">
    </label>
    <br>
    <a>Author</a>
    <br>
    <label>
        <input type=text name="aut">
    </label>
    <br>
    <P> Description<br/>
        <label>
            <input type=text name="description">
        </label><br>
        <input type=submit name="submit" value="Create and show"> <br>
</form>
<?php
include 'Article.php';
if (isset($_POST['submit']) and isset($_POST['titl']) and isset($_POST['aut']) and isset($_POST['description'])) {
    $title = $_POST['titl'];
    $author = $_POST['aut'];
    $description = $_POST['description'];

    $art = new Article($title, $author, $description);
    echo $art->show_article();

}
?>
</body>
</html>