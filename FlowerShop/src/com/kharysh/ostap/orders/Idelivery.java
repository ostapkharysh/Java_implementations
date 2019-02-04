package com.kharysh.ostap.orders;

import java.util.LinkedList;

/**
 * Created by Ostap Kharysh on 08.11.2016.
 */
public interface Idelivery {
    /*
    This is an interface which provides special feature for Bouquet instance independently.
     */
    public String deliver(LinkedList items);
}
