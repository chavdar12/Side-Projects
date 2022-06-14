<html> 
    <head>
        <title>20621620</title>
    </head>
    <body> 
<?php
        $names = array(1=>"Иван Иванов", 2=>"Драган Драганов", 3=>"Димо Петров");
        $grades = array(1=>'4',2=>'5.45',3=>'5.67');
        
       echo "<ol>";
       echo "<li>Студент $names[1] има успех $grades[1]</li>";
       echo "<li>Студент $names[2] има успех $grades[2]</li>";
       echo "<li>Студент $names[3] има успех $grades[3]</li>";
       echo " </ol>";
       
        echo "<ul>";
       echo "<li>Студент $names[1] има успех $grades[1]</li>";
       echo "<li>Студент $names[2] има успех $grades[2]</li>";
       echo "<li>Студент $names[3] има успех $grades[3]</li>";
       echo " </ul>";
       
       echo "<table border = 4>";
       echo "<tr>";
       echo "<th>Име, Фамилия </th><br><th> Успех </th> </tr>";
       echo "<tr>";
       echo "<td>$names[1] </td><br><td> $grades[1] </td> </tr>";
       echo "<tr>";
       echo "<td>$names[2] </td><br><td> $grades[2] </td> </tr>";
       echo "<tr>";
       echo "<td>$names[3] </td><br><td> $grades[3] </td> </tr>";
       
                ?>
    </body> </html>