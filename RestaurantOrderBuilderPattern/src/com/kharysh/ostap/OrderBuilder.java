package com.kharysh.ostap;


/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
abstract class OrderBuilder {
    /*
    This is the class to provide the Builder Pattern.
     */
    protected Order order;

    public Order getOrder(){
        return order;
    }
    public void createOrder(){
        order = new Order();
    }

    public abstract void buildBeverage();
    public abstract void buildFirstCourse();
    public abstract void buildSecondCourse();
    public abstract void buildDessert();
}
