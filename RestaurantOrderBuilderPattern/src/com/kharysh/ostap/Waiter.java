package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class Waiter {
    /*
    This is a class object to which uses Builder Pattern to fulfill its features.
     */
    private OrderBuilder orderBuilder;

    public  void setOrderBuilder(OrderBuilder ordBil){
        orderBuilder = ordBil;
    }
    public Order getOrder(){
        return orderBuilder.getOrder();
    }

    public void takeOrder(){
        orderBuilder.createOrder();
        orderBuilder.buildBeverage();
        orderBuilder.buildFirstCourse();
        orderBuilder.buildSecondCourse();
        orderBuilder.buildDessert();
    }
}

