package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class StudentLunch extends OrderBuilder {

    /*
    This is a class object provides with interface realisation.
     */

    @Override
    public void buildBeverage() {
        order.setBeverage("juice");
    }

    @Override
    public void buildFirstCourse() {
        order.setFirstCourse("buckweat_soup");

    }

    @Override
    public void buildSecondCourse() {
        order.setSecondCourse("potatoe_chips + chicken_nuggets");

    }

    @Override
    public void buildDessert() {
        order.setDessert("ice_cream");

    }
}
