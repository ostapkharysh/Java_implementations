package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
class Order {
    /*
    This is a class instance which provides the decision taking over the class object features.
     */
    private String beverage = " ";
    private String firstCourse = " ";
    private String secondCourse = " ";
    private String dessert = " ";

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public void setFirstCourse(String firstCourse) {
        this.firstCourse = firstCourse;
    }

    public void setSecondCourse(String secondCourse) {
        this.secondCourse = secondCourse;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String toString(){
        return "The order: Beverage: "+ this.beverage + ", First course: "
                + this.firstCourse + ", Second course: " + this.secondCourse +
                ", Dessert: " + this.dessert;
    }
}
