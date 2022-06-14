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

class Human
{
    protected $first_name;
    protected $last_name;

    public function __construct($first_name, $last_name)
    {
        $this->first_name = $first_name;
        $this->last_name = $last_name;
    }

    public function show_person(): void
    {
        print("My name is, " . $this->first_name . " " . $this->last_name . "!");
    }
}

class Programmer extends Human
{
    public function set_lang(): void
    {
        $languages = array("Java", "JavaScript");
        $languages[] = "PHP";
        print("<br>I know also " . end($languages) . ".<br>");
        print_r($languages);
    }
}

print("Hello! <br>");
$newProgram = new Programmer("Ivan", "Ivanov");
$newProgram->show_person();
$newProgram->set_lang();
?>
</body>
</html>