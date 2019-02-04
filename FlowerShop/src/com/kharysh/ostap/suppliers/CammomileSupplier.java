package com.kharysh.ostap.suppliers;

import com.kharysh.ostap.flowers.FlowerSpec;
import com.kharysh.ostap.flowers.FlowerType;
import com.kharysh.ostap.last_order.Bouquet;
import com.kharysh.ostap.orders.Item;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Ostap Kharysh on 15.11.2016.
 */
public class CammomileSupplier implements Observer{
    /*
    This is a part of Observer pattern realisation which provides the informing of the certain condition changing.
     */
    @Override
    public void update(Observable o, Object arg) {
        LinkedList <Item> item = (LinkedList<Item>) arg;
        FlowerSpec spec = new FlowerSpec();
        spec.setType(FlowerType.Cammomile);
        for (Item it: item){
            Bouquet buket = (Bouquet) it;
            System.out.println("Sent request " + buket.search(spec).size() + " cammomiles");
        }
    }
}
