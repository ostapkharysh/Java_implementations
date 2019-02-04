package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 28.11.2016.
 */
public enum  NumbOfLifts {
    TEN, TWENTY, FIFTY, HUNDRED, ZERO;

    public int SetDate() {
        int days = 0;
        switch (this) {
            case TEN:
                return 10;
            case TWENTY:
                return 20;
            case FIFTY:
                return 50;
            case ZERO:
                return 0;
            case HUNDRED:
                return 100;

        }
        return days;
    }
}
