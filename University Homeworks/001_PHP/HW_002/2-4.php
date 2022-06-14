<html><head>
    <title>20621620</title>
</head>
<body>
<?php
echo "Днес е: " . date("d/m/Y") . "<br>";
if(date("d/m/Y") > date("d/8/Y"))
    echo "Август е, и е наистина горещо.";
else echo "Не е август, така че поне не е горещо!";
?>
</body></html>