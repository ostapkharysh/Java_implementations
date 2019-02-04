package com.kharysh.ostap.orders;

/**
 * Created by Ostap Kharysh on 12.11.2016.
 */
public class RibbonDecorator  extends ItemDecorator {
    /*
    This class is adding a new supporting chracteristic to class instance.
    */

    public RibbonDecorator(Item item) {
        super(item);
    }
    public String getDescription() {
        return " Cute expensive Ribbon";
    }
    public double price() {
        return 40 + item.price();
    }
}
