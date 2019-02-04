package com.kharysh.ostap.last_order;

/**
 * Created by Ostap Kharysh on 22.11.2016.
 */
public enum  BouquetType {
    /*
    This class provides enumeration in choosing certain feature of Bouquet instance.
     */
    WEDDING, FUNERAL, CHAMMOMILE;
    public String toString(){
        String result = "";
        switch(this){
            case WEDDING:{
                return "Wedding";
            }
            case FUNERAL:{
                return "Funeral";
            }
            case CHAMMOMILE:{
                return "Chammomile";

            }
        }
        return result;
    }

}
