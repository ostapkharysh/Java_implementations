package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 06.12.2016.
 */
public class Dollar50DIsp extends Dispencer {
    /*
    This class is a part of chain of responsibility pattern.
    Provides its functionality and is the last in chain of responsibility.
    */
    public void getAmout(Currency currency) {
        int mon = currency.getMoney();
        System.out.println(mon);
        next.getAmout(new Currency(mon%50));
        System.out.println(mon/50 + " by 50 banknot");
    }
}
