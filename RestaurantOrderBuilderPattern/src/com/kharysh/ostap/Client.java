package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class Client {
    /*
    This class provides with testing and creates full vision of unite classes work.
     */
    public static void main(String[] args) {
        Waiter wt = new Waiter();
        OrderBuilder business_lunch = new BussinessLunch();
        OrderBuilder student_lunch = new StudentLunch();

        wt.setOrderBuilder(business_lunch);
        wt.takeOrder();

        Order order1 = wt.getOrder();
        System.out.println(order1.toString());

        wt.setOrderBuilder(student_lunch);
        wt.takeOrder();

        Order order2 = wt.getOrder();
        System.out.println(order2.toString());

    }
}
