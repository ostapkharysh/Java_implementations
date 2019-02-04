package com.kharysh.ostap;

public class Main {

    public static void main(String[] args) {
	Pass pass = new Pass();
        pass.setId(123213);
        pass.setTypeOfDays(TypeOfDays.WORKINGDAYS);
        //pass.setNumbOfLifts(NumbOfLifts.TEN);
        pass.setPeriod(WorkingDaysPeriod.ONEDAY);

        System.out.println(pass.getPeriod());

    }
}
