package com.kharysh.ostap.flowers;

/**
 * Created by Ostap Kharysh on 21.10.2016.
 */
public enum FlowerType{
    /*
    This class provides enumeration in choosing certain feature of Flower instance.
    */
    Tulip, Cammomile, Rose,  Violet;
    public String toString() {
        String result = " ";
        switch (this) {
            case Tulip:
                return "Tulip";
            case Cammomile:
                return "Cammomile";
            case Rose:
                return "Rose";
            case Violet:
                return  "Violet";

        }
        return result;
    }

}

