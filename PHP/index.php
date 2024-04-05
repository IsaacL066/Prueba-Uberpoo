<?php 
require_once("Car.php");
require_once("uberx.php");
require_once("uberx.php");
require_once("user.php");
require_once("account.php");

$car = new Car ("Karol", new Account ("Gonzalo Cortez", "kazi35", "Gonzalo@hotmail.com"));
$car->printDatacar();

$car = new Car ("Melisa", new Account ("Gonzalo Cortez", "honda35", "Gonzalo@hotmail.com"));
$car->printDatacar();

$car = new Car ("Manuel", new Account ("Gonzalo Cortez", "Zon35", "Gonzalo@hotmail.com"));
$car->printDatacar();
?>
