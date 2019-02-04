package com.kharysh.ostap.orders;

import com.kharysh.ostap.suppliers.CammomileSupplier;
import com.kharysh.ostap.suppliers.TulipSuppplier;

import java.util.LinkedList;
import java.util.Observable;

/**
 * Created by Ostap Kharysh on 08.11.2016.
 */
public class Order extends Observable {
    /*
    This class provides a functionality to work with class instances, and provides Observer pattern realisation.
     */
    LinkedList<Item> items = new LinkedList<Item>();
    private Ipayment payment;
    private Idelivery delivery;

    public void Order() {
        this.addObserver(new CammomileSupplier());
        this.addObserver(new TulipSuppplier());

    }

    public void add(Item itm){
        /*
        Adding object instances
         */
        items.add(itm);

    }
    public double getPrice(){
        /*
        Counts commomn feature for all object instances implementing or decorating  certain abstract class.
         */
        double finSum = 0;
        for (int x = 0; x< items.size(); x++){
            finSum += items.get(x).price();
        }
        return finSum;
    }




    public void  processOrder(){
        /*
        Provides with certain functionality and decoration of certain class Object.
         */
        getDelivery().deliver(items);
        getPayment().pay(calculateTotalPrice());
        if (payment != null){;
            this.notifyObservers(items);
        }
    }

    public double calculateTotalPrice(){
        /*
        Provides with certain functionality and decoration of certain class Object.
        */
        double res = 0;
        for (Item itm: items){
                res+=itm.price();
        }
        return res;
    }

    public void setTDHLDelivery(boolean decision){
        /*
        Creates new class instances to widen class object features.
        */
        if (decision) {
            System.out.println("DHL Delivery Chosen");
            this.delivery = new DHLDeliveryStrategy();
        }
        else{
            System.out.println("Post Delivery Chosen");
            this.delivery = new PostDeliveryStrategy();

        }
    }
    public void setPayPAlPayment(boolean decision){
        /*
        Creates new class instances to widen class object features.
        */
        if (decision){
            System.out.println("Pay Pal Payment Chosen");
            this.payment = new PayPalPaymentStrategy();
        }
        else{
            System.out.println("Credit Card Payment Chosen");
            this.payment = new CreditCardPaymentStrategy();
        }
    }

    public Ipayment getPayment() {
        return payment;
    }

    public Idelivery getDelivery() {
        return delivery;
    }
}
