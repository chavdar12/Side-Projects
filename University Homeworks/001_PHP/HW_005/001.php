<html> 
    <head>
        <title>20621620</title>
    </head>
    <body> 
        <p> ЛИЦЕ НА ПРАВОЪГЪЛНИK
        <FORM name="form" method="post" action="#" >
    Въведете дължина и ширина на правоъгълник:<br>
    Дължина:
    <input type="number" name="l"/>
    Ширина:
    <input type="number" name="w"/> <br/>
    <input type="submit" name="submit" value="GO!" />
</FORM>

<?php
        if (isset($_POST['submit']))
{    
            $l = $_POST['l'];
            $w = $_POST['w'];
            
            $area = $w * $l;
            
            echo "<font color=”chucknorris”>Лице на правоъгълник</font><br>";
            echo "<font color=”chucknorris”>Правоъгълник с дължина $l и ширина $w има лице $area</font>";
}

?>
</tr></table>
    </body> </html>