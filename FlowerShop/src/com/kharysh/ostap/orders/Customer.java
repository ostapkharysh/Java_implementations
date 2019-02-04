package com.kharysh.ostap.orders;

import com.kharysh.ostap.flowers.Flower;

/**
 * Created by Ostap Kharysh on 01.11.2016.
 */
public class Customer {

    /*
    This class creates the class instance with specific features.
     */
    private final int id;
    private static int numbOfCastomers;
    private String name;
    private Flower purchase = new Flower();

    public Customer(){
        id = numbOfCastomers;
        numbOfCastomers++;
    }

    public void killCustomerById(Customer o)
        /*
        This method provides with certain functionality
        */
    {
        System.out.println(o.id + "kill");
    }



}
