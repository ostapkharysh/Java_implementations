package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class BussinessLunch extends OrderBuilder {
    /*
    This is a class object provides with interface realisation.
     */
    @Override
    public void buildBeverage() {
        order.setBeverage("wine");
    }

    @Override
    public void buildFirstCourse() {
        order.setFirstCourse("soup_of_the_day");
    }

    @Override
    public void buildSecondCourse() {
        order.setSecondCourse("chiken salad + mediterian_shells + lobster");

    }

    @Override
    public void buildDessert() {
        order.setDessert("tiramisu");
    }
}
