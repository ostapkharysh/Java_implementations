package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 28.11.2016.
 */
public class WorkingPeriodTypeOfPass extends TypeOfPass {
    WorkingDaysPeriod days;
    WorkingPeriodTypeOfPass(PassMain passMain) {
        super(passMain);
    }

    @Override
    public String getDescription() {
        return "WORKING DAYS";
    }

    @Override
    public  int num_of_lift() {
        return 0;
    }

    @Override
    public WorkingDaysPeriod period() {
        return days;
    }
}
