package com.kharysh.ostap.last_order;

/**
 * Created by Ostap Kharysh on 22.11.2016.
 */


public class Factory {
    /*
    This class is implementing Factory method decision
     */
        public Bouquet chooseBouquet (BouquetType type){
            if (type.equals(BouquetType.WEDDING)) {
                return new WeddingBouquet();
            }
            else if(type.equals(BouquetType.CHAMMOMILE)){
                return new CammomileBouquet();
            }
            else if(type.equals(BouquetType.FUNERAL)){
                return new FuneralBouquet();
            }
            else {
                System.out.println("No such bouquet");
                return null;
            }
        }
    }

