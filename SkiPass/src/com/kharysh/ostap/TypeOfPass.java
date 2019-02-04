package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 28.11.2016.
 */
public abstract class TypeOfPass implements PassMain {

    public PassMain passMain;
    TypeOfPass(PassMain passMain) {
        this.passMain = passMain;
    }
    public abstract String getDescription();
    public abstract int num_of_lift();
    public abstract WorkingDaysPeriod period();
}
