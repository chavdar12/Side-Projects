<html><head>
    <title>20621620</title>
</head>
<body>
<FORM name="form" method="post" action="#" >
    Enter the number:
    <input type="text" name="number"/> <br/>
    Enter the digit:
    <input type="text" name="digit"/> <br/>
    <input type="submit" name="submit" value="GO" />
</FORM>
<?php
if (isset($_POST['submit']))
{
   $number = $_POST['number'];
   $digit = $_POST['digit'];
   
   $digitChar = str_split($number);
	$count = 0;
	foreach($digitChar as $char) {
		if (is_numeric($char) && $char == $digit) {
			$count++;
		}
	}
        echo "The number contains $count times digit $digit";
}
?>
</body></html>