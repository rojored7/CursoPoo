<?php
require_once('car.php');
class UberX extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial) {
        parent::__construct($license,$driver, $typeCarAccepted, $seatsMaterial)
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
      } 

}
?>