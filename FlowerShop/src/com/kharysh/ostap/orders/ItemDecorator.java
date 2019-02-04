package com.kharysh.ostap.orders;

/**
 * Created by Ostap Kharysh on 12.11.2016.
 */
abstract class ItemDecorator extends Item{
    /*
    This class provides with additional featuring of class instance.
     */
   public Item item;
    ItemDecorator(Item item) {
        this.item = item;
    }
    public abstract String getDescription();
    public abstract double price();
}
