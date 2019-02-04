package com.kharysh.ostap.last_order;

import com.kharysh.ostap.flowers.Flower;
import com.kharysh.ostap.flowers.FlowerSpec;
import com.kharysh.ostap.flowers.FlowerType;

/**
 * Created by Ostap Kharysh on 22.11.2016.
 */
public class CammomileBouquet extends Bouquet {

    /*
    Creates instance of Bouquet using Factory method
    */

    Bouquet bq;
    public CammomileBouquet() {
        this.bq = new Bouquet();
        for (int i = 0; i <= 30; i++) {
            FlowerSpec sp = new FlowerSpec();
            sp.setType(FlowerType.Cammomile);
            Flower tulip = new Flower(sp, 5, 2);
            this.bq.addFlower(tulip);

        }
    }
    public double price(){
        return this.bq.price();
    }
    public String getDescription(){
        return "Cammomile Buquet";
    }
}
