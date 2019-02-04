package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class VechicleAdapter implements CarStore {
    /*
    This class provides with Adapter Pattern. Provides with functionality  and interface realisation.
     */
    MultiVechicleStore multiVechicleStore;

    public VechicleAdapter(String vechicleType){
        if(vechicleType.equalsIgnoreCase("car")){
            multiVechicleStore = new CarSale();
        }
        else if(vechicleType.equalsIgnoreCase("motorcycle")){
            multiVechicleStore = new MotorcycleSale();
        }
        else if(vechicleType.equalsIgnoreCase("atv")){
            multiVechicleStore = new ATVSale();
        }
        else {
            System.out.println("NO SUCH TYPE.");
        }
    }

    @Override
    public void sell(String vechicleType, String name) {
        if(vechicleType.equalsIgnoreCase("car")){
            multiVechicleStore.sellCar(name);
        }
        else if(vechicleType.equalsIgnoreCase("motorcycle")){
            multiVechicleStore.sellMotorcycle(name);
        }
        else if(vechicleType.equalsIgnoreCase("atv")){
            multiVechicleStore.sellATV(name);
        }
        else{
            System.out.println("NO SUCH TYPE.");
        }
    }

}
