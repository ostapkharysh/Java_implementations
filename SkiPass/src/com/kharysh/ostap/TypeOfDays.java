package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 28.11.2016.
 */
public enum TypeOfDays{
    WEEKEND, WORKINGDAYS, SEASON;
    public String toString() {
        String out = "";
        switch (this){
            case WEEKEND:
                return "WEEKEND";
            case WORKINGDAYS:
                return "WORKING DAYS";
            case SEASON:
                return "SEASON";
        }
        return out;
    }
}
