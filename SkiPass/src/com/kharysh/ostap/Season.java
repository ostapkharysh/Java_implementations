package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 28.11.2016.
 */
public class Season extends TypeOfPass {
    Season(PassMain passMain) {
        super(passMain);
    }

    @Override
    public String getDescription() {
        return "FOR SEASON";
    }

    @Override
    public int num_of_lift() {
        return 0;
    }

    @Override
    public WorkingDaysPeriod period() {
        return null;
    }
}
