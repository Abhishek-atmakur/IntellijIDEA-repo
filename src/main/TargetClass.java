package main;

import service.ICar;

public class TargetClass {

    private ICar iCar;

//    public void setiCar(ICar iCar) {
//        this.iCar = iCar;
//    }


    public TargetClass(ICar iCar) {
        this.iCar = iCar;
    }

    public TargetClass(){

    }

    public String knowCarprice(){
        return iCar.carPrice(1345.6);
    }


}
