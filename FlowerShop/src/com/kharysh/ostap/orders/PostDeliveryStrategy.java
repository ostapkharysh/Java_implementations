package com.kharysh.ostap.orders;

import java.util.LinkedList;

/**
 * Created by Ostap Kharysh on 12.11.2016.
 */
public class PostDeliveryStrategy implements Idelivery {
    /*
    This class provides with interface implemetation.
     */
    public String deliver(LinkedList items){
        return "You choose Post delivery of " + items+ " flowers";

    }
}
