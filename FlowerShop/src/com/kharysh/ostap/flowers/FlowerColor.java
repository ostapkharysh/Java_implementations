package com.kharysh.ostap.flowers;

/**
 * Created by Ostap Kharysh on 21.10.2016.
 */
public enum FlowerColor {
    /*
    This class provides enumeration in choosing certain feature of Flower instance.
    */
    BLACK, WHITE, YELLOW, ORANGE, RED, BLUE, GREEN;

    public String toString() {
        String a = " ";
        switch (this) {
            case BLACK:
                return "Black";
            case WHITE:
                return "Whilte";
            case YELLOW:
                return "Yellow";
            case ORANGE:
                return "Orange";
            case RED:
                return "Red";
            case BLUE:
                return "Blue";
            case GREEN:
                return "Green";

        }
        return a;
    }

}
