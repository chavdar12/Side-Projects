<html><head>
    <title>20621620</title>
</head>
<body>
<FORM name="form" method="post" action="#" >
    Please enter your age: <br />
    <input type="number" name="age"/> <br/>
    Please enter the price <br />
    <input type="number" name="price"/>
    <input type="submit" name="submit" value="Go" />
</FORM>
<?php
if (isset($_POST['submit']))
{
   $age = $_POST['age'];
   $price = $_POST['price'];
   if( $age <= 6 || $age >= 65)
   {
       $price = $price / 2;
       echo "Your age is $age. The price is $$price";
   } else echo "Your age is $age. The price is $$price";
   
}
?>
</body></html>