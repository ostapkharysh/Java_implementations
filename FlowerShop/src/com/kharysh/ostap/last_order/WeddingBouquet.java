package com.kharysh.ostap.last_order;

import com.kharysh.ostap.flowers.Flower;
import com.kharysh.ostap.flowers.FlowerSpec;
import com.kharysh.ostap.flowers.FlowerType;

/**
 * Created by Ostap Kharysh on 22.11.2016.
 */

public class WeddingBouquet extends Bouquet  {

    /*
    Creates instance of Bouquet using Factory method
    */

    Bouquet bq;
    public WeddingBouquet() {
        this.bq = new Bouquet();
        FlowerSpec sp = new FlowerSpec();
        Flower tulip = new Flower(sp, 12, 2);
        sp.setType(FlowerType.Tulip);
        for (int i = 0; i <= 10; i++) {
            this.bq.addFlower(tulip);
        }
    }
    public double price(){
        return this.bq.price();
}
    public String getDescription(){
        return "Wedding Buquet";
    }
}


