package main;

import service.i20;

public class LaunchSpring2 {
    public static void main(String[] args) {
        TargetClass targetClass = new TargetClass(new i20());
        //targetClass.setiCar(new i20());

        String result  = targetClass.knowCarprice();
        System.out.println(result);


    }
}
