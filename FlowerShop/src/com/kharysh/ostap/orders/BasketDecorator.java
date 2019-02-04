package com.kharysh.ostap.orders;

/**
 * Created by Ostap Kharysh on 12.11.2016.
 */
public class BasketDecorator extends ItemDecorator{
    /*
    This class is adding a new supporting chracteristic to class instance.
     */
    public BasketDecorator(Item item) {
        super(item);
    }
    public String getDescription() {
        return " Chernivetsko-Rumunskyy nice basket ";
    }
    public double price() {
        return 4 + item.price();
    }
}
