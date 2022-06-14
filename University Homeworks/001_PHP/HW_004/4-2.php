<html> 
    <head>
        <title>20621620</title>
    </head>
    <body> 
<?php
        $cities = array("Tokyo", "Mexico City", "New York", "Mumbai", "Seoul", "Shanghai", "Lagos", "Buenos Aires", "Cairo", "London");
        
        foreach ($cities as $key => $value) {
            echo "$value, ";
        }
        
        sort($cities, SORT_STRING);
        echo "<ul>";
        foreach ($cities as $value2) {
            echo "<li>$value2</li>";
        }
        echo " </ul>";
       
       $cities[10] = "Los Angeles"; $cities[11] = "Calcutta"; $cities[12] = "Osaka"; $cities[13] = "Beijing";
       
        sort($cities, SORT_REGULAR);
        echo "<ol>";
        foreach ($cities as $value3) {
            echo "<li>$value3</li>";
        }
        echo "</ol>";
       
       $key = array_keys($cities);
       echo "<table border = 4>";
       echo "<tr>";
       echo "<th> key </th><br><th> value </th> </tr>";
       foreach ($cities as $key => $value4){
           echo "<tr>";
            echo "<td>$key</td><br><td> $value4 </td> </tr>";
       }
       
                ?>
    </body> </html>