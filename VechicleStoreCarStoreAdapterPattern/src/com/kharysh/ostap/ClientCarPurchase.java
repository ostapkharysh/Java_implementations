package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class ClientCarPurchase {
    /*
    This is a class which provides with certain testing and shows the another class functionality.
     */
    public static void main(String[] args) {
        CarOfficialResseler carOffRes = new CarOfficialResseler();

        carOffRes.sell("car", "Tesla 2000");
        carOffRes.sell("motorcycle", "Hyundai Super");
        carOffRes.sell("atv", "Honda");
        carOffRes.sell("scooter", "Bombardier");
    }
}
