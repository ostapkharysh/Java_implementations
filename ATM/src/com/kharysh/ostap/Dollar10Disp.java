package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 06.12.2016.
 */
public class Dollar10Disp extends Dispencer {
    /*
    This class is a part of chain of responsibility pattern.
    Provides its functionality and calls for next class
     */
    @Override
    public void getAmout(Currency currency) {
        int mon = currency.getMoney();
        System.out.println(mon);
        System.out.println(mon/10 + " by 10 banknot");
    }
}
