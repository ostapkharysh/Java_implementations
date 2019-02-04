package com.kharysh.ostap.orders;

/**
 * Created by Ostap Kharysh on 12.11.2016.
 */
public class PayPalPaymentStrategy implements Ipayment {
    /*
    This class provides with interface implemetation.
     */

    @Override
        public String pay(double price) {
            return "Payment of " + price + "for flowers  by PayPal";
        }
    }
