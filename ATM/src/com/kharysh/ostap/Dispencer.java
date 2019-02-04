package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 06.12.2016.
 */
public abstract class Dispencer {
    /*
    This clas provides with a class functionality.
     */
    Dispencer next;
    public abstract void getAmout(Currency currency);
    public void setNext(Dispencer next) {
        this.next = next;
    }
}
