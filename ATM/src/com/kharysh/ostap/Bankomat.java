package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 20.12.2016.
 */
public class Bankomat {
    /*
    This class creates the object instance, provides with functionality testing of working process.
     */
    public void withdrawMonet(int money){
        Dollar10Disp d10 = new Dollar10Disp();
        Dollar20DIsp d20 = new Dollar20DIsp();
        Dollar50DIsp d50 = new Dollar50DIsp();
        d50.setNext(d20);
        d20.setNext(d10);
        d50.getAmout(new Currency(money));
    }

}
