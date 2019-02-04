package com.kharysh.ostap.flowers;

import com.kharysh.ostap.suppliers.CammomileSupplier;

/**
 * Created by Ostap Kharysh on 21.10.2016.
 */
public class FlowerSpec {
    /*
    This class widen the number of  feature of Flower instance and provides with special manipulations.
    */
    CammomileSupplier chamSip = new CammomileSupplier();
    private FlowerColor color = null;
    private int numbofdays = -1;
    private double price = 0;
    private FlowerType type = null;
    public FlowerSpec() {

    }


    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }


    public int getNumbofdays() {
        return numbofdays;
    }

    public void setNumbofdays(int numbofdays) {
        this.numbofdays = numbofdays;
    }

    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }

    public boolean match(FlowerSpec another){
        /*
        This method provides with search method to find the object by certain feature.
         */
        if (color != another.color && another.color != null ){
            System.out.println("color");
            return false;
        }
        if (numbofdays != another.numbofdays  && another.numbofdays !=-1){
            System.out.println("numbofdays");
            return false;
        }
        if (price != another.price && another.price != -1){
            System.out.println("price");
            return false;
        }
        if (getType() != another.getType() && another.getType() != null){
            System.out.println("type " + getType() + " " + another.getType());
            return false;
        }
        System.out.println("Yes");
        return true;

    }

}
