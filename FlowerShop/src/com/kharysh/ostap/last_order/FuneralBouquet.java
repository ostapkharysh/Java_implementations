package com.kharysh.ostap.last_order;

import com.kharysh.ostap.flowers.Flower;
import com.kharysh.ostap.flowers.FlowerSpec;
import com.kharysh.ostap.flowers.FlowerType;

/**
 * Created by Ostap Kharysh on 23.12.2016.
 */
public class FuneralBouquet extends Bouquet {

    /*
    Creates instance of Bouquet using Factory method
    */

    Bouquet bq;

    public FuneralBouquet() {
        this.bq = new Bouquet();
        for (int i = 0; i <= 14; i++) {
            FlowerSpec sp = new FlowerSpec();
            sp.setType(FlowerType.Rose);
            Flower tulip = new Flower(sp, 5, 2);
            this.bq.addFlower(tulip);
        }
        for (int i = 0; i <= 13; i++) {
            FlowerSpec sp = new FlowerSpec();
            sp.setType(FlowerType.Cammomile);
            Flower tulip = new Flower(sp, 5, 2);
            this.bq.addFlower(tulip);
        }
    }

    public double price() {
        return this.bq.price();
    }

    public String getDescription() {
        return "Funeral Buquet";
    }
}
