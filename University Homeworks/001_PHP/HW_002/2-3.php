<html><head>
    <title>20621620</title>
</head>
<body>
<FORM name="form" method="post" action="#" >
    Enter the number of month: <br/>
    <input type="number" name="a"/> <br/>
    <input type="submit" name="submit" value="GO" />
</FORM>
<?php
if (isset($_POST['submit']))
{
   $a = $_POST['a'];

   switch ($a) {
       case 1: echo "The result is: winter";
           break;
       case 2: echo "The result is: winter";
           break;
       case 3: echo "The result is: spring";
           break;
       case 4: echo "The result is: spring";
           break;
       case 5: echo "The result is: spring";
           break;
       case 6: echo "The result is: summer";
           break;
       case 7: echo "The result is: summer";
           break;
       case 8: echo "The result is: summer";
           break;
       case 9: echo "The result is: autumn";
           break;
       case 10: echo "The result is: autumn";
           break;
       case 11: echo "The result is: autumn";
           break;
       case 12: echo "The result is: winter";
           break;
       default:
           break;
   }
}
?>
</body></html>