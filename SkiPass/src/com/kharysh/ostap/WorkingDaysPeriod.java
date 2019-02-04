package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 28.11.2016.
 */
public enum WorkingDaysPeriod {
    ZERODAYS, ONEDAY, TWODAYS, FIVEDAYS;

    public int SetDate() {
        int days = 0;
        switch (this) {
            case ONEDAY:
                return 1;
            case TWODAYS:
                return 2;
            case FIVEDAYS:
                return 5;
            case ZERODAYS:
                return 0;

        }
    return days;
    }
}
