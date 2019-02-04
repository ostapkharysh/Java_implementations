package com.kharysh.ostap.flowers;


public class Flower {
    /*
    This class realisation creates a certain object with features and provide its manipulation
     */
    public FlowerSpec my_spec;
    public FlowerType type;
    public double stem = 0;
    public double price =0;

    public Flower( FlowerSpec my_spec, double price, double stem) {
        this.my_spec = my_spec;
        this.stem = stem;
        this.type = type;
        this.price = price;
    }

    public Flower() {

    }

    public FlowerSpec getMy_spec() {
        /*
        This class calls for specific class whish widen its features number and provide with specia; ability
         */
        return my_spec;
    }


    public FlowerColor getColor() {
        return my_spec.getColor();
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double pr) {
        this.price = pr;
    }

    public double getNumbofdays() {
        return my_spec.getNumbofdays();
    }

    public void setNumbofdays(int nb) {
        my_spec.setNumbofdays(nb);
    }

    public double getStem(){
        return this.stem;
    }



    public String toString() {
        return "Price " + getPrice()+ " type " + my_spec.getType()+ " color " + my_spec.getColor();
    }

}
