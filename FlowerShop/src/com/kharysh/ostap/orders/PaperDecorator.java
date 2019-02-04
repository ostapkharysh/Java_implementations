package com.kharysh.ostap.orders;

/**
 * Created by Ostap Kharysh on 12.11.2016.
 */
public class PaperDecorator extends ItemDecorator {
    /*
    This class is adding a new supportin chracteristic to class instance.
     */
    public PaperDecorator(Item item) {
        super(item);
    }
    public String getDescription() {
        return " Simple Paper";
    }

    @Override
    public double price() {
        return 15 + item.price();
    }

}
