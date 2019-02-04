package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class CarOfficialResseler implements CarStore {
    /*
    This is a class which provides the class instance with certain functionality,
    which can be widen using Adapter Pattern.
     */
    VechicleAdapter vechAdapter;
    @Override
    public void sell(String vechicleType, String name) {
        if(vechicleType.equalsIgnoreCase("car")){
            System.out.println("Selling car. Name: " + name);
        }
        else if(vechicleType.equalsIgnoreCase("motorcycle") ||vechicleType.equalsIgnoreCase("atv")){
            vechAdapter = new VechicleAdapter(vechicleType);
            vechAdapter.sell(vechicleType, name);
        }
        else{
            System.out.println("No such type. We have no " + vechicleType + " in our store.");
        }
    }
}
