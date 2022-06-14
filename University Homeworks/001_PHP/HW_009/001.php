<?php

class Donation
{

    private $name;
    private $amount;
    public static $totalDonated = 0;
    public static $numberOfDonors = 0;

    public function __construct($name, $amount)
    {
        $this->name = $name;
        $this->amount = $amount;
        self::$totalDonated += $amount;
        self::$numberOfDonors++;
    }

    public function info()
    {
        $percent = $this->amount / self::$totalDonated * 100;
        echo $this->name . " donated " . $this->amount . " (" . round($percent, 2) . ")";
    }
}

$donors = array(new Donation("Nikola", 85.00), new Donation("Mitko", 50.00), new Donation("Emily", 90.00), new Donation("Iliana", 65.00));
foreach ($donors as $value) {
    print($value->info() . "<br>");
}

$total = Donation::$totalDonated;
$number = Donation::$numberOfDonors;
print("Total Donations  = " . $total . "<br>");
print("Number of Donors = " . $number);