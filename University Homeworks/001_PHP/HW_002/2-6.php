<html> 
    <head>
        <title>20621620</title>
    </head>
    <body> 
    <?php
        echo "x&emsp;square&emsp;squareRoot <br>";
        $x = 1;
        for($i = 1; $i <= 12; $i++){
            $square = round(pow($x,2),2);
            $squareRoot = round(sqrt($x),2);
            echo "$x&emsp;";
            echo "$square&emsp;";    
            echo"&emsp;&emsp;$squareRoot <br>";
            $x++;
        }
    ?>
    </body> </html>