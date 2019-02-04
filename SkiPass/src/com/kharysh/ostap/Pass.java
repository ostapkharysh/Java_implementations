package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 28.11.2016.
 */
public class Pass implements PassMain{
    public int id;
    WorkingDaysPeriod period;
    NumbOfLifts numbOfLifts;
    TypeOfDays typeOfDays;

    public  Pass(){

    }
    public Pass(int id, WorkingDaysPeriod period, NumbOfLifts numb_of_lifts, TypeOfDays typeOfDays){
        this.id = id;
        this.period = period;
        this.numbOfLifts = numb_of_lifts;
        this.typeOfDays = typeOfDays;
    }

    @Override
    public String getDescription() {
        return "Only Pass";
    }

    @Override
    public int num_of_lift() {
        return 0;
    }

    @Override
    public WorkingDaysPeriod period() {
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WorkingDaysPeriod getPeriod() {
        return period;
    }

    public void setPeriod(WorkingDaysPeriod period) {
        if(this.typeOfDays.toString().equals("SEASON")){
            System.out.println("YOU HAVE PASS FOR THE SEASON YOU DONT NEED THIS CONFIGURATIONS");
            this.period = null;}
        if (this.numbOfLifts != null) {
            System.out.println("YOU HAVE ALREADY ASSIGNED THE NUMBER OF LIFTS ");
            this.period = null;
        } else {
            if(this.typeOfDays.toString().equals("WORKING DAYS")){
                this.period = period;
            }
            if(this.typeOfDays.toString().equals("WEEKEND")){
                if (!period.toString().equals("FIVEDAYS")){
                    this.period = period;
                }
            }

        }
    }

    public NumbOfLifts getNumbOfLifts() {
        return numbOfLifts;
    }

    public void setNumbOfLifts(NumbOfLifts numbOfLifts) {
        if(this.typeOfDays.toString().equals("SEASON")){
            System.out.println("YOU HAVE PASS FOR THE SEASON YOU DONT NEED THIS CONFIGURATIONS");
            this.period = null;}
        if (this.period != null) {
            System.out.println("YOU HAVE ALREADY ASSIGNED THE PERIOD ");
            this.numbOfLifts = null;}
        else{
            this.numbOfLifts = numbOfLifts;
        }
    }

    public TypeOfDays getTypeOfDays() {
        return typeOfDays;
    }

    public void setTypeOfDays(TypeOfDays typeOfDays) {
        this.period = null;
        this.numbOfLifts = null;
        this.typeOfDays = typeOfDays;
    }
}

