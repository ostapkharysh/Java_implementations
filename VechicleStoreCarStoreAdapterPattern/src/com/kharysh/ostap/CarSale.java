package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class CarSale implements MultiVechicleStore {
    /*
    This is a class which provides with interface imlementation.
     */
    @Override
    public void sellCar(String name) {
        System.out.println("Selling the car. Name: "+ name);
    }

    @Override
    public void sellMotorcycle(String name) {

    }

    @Override
    public void sellATV(String name) {

    }
}
