package com.kharysh.ostap.last_order;

import com.kharysh.ostap.flowers.Flower;
import com.kharysh.ostap.flowers.FlowerSpec;
import com.kharysh.ostap.orders.Item;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ostap Kharysh on 04.10.2016.
 */
public class Bouquet extends Item {
    /*
    This class implements Bouquet realisation by adding instances of Flower class,
    and provide certain functionality of this set of Flower instances
     */
    private int max = 16;
    public double price = 0;


    public Flower[] flwrs = new Flower[max];

    private int lastIndex = 0;

    public void addFlower(Flower nw) {
        /*
        This method provides addition of Flower class instances
         */
        if (max - 1 < lastIndex) {
            Flower[] newFlwrs = new Flower[max * 2];
            for (int i = 0; i < max; i++) {
                newFlwrs[i] = flwrs[i];
            }
            max *= 2;
            flwrs = newFlwrs;
        }
        price += nw.getPrice();
        flwrs[lastIndex] = nw;
        lastIndex++;
    }

    public void sortByDays() {
        /*
        This method provide sortinf by certain feature
         */
        Flower[] flwrsret = new Flower[lastIndex];
        int small = (int) flwrs[0].getNumbofdays();
        for (int x = 0; x < flwrs.length; x++) {
            for (int y = 0; y < flwrs.length; y++) {
                if (small < (int) flwrs[y].getNumbofdays()) {
                    small = (int) flwrs[y].getNumbofdays();
                }

            }
        }
    }

    public List search(FlowerSpec searchSpec) {
        /*
        This method provide searching the right instance of class Flower by its certain feature
         */
        List flowers_match = new LinkedList();
        for (int i = 0; i < lastIndex; i++) {
            Flower flower = flwrs[i];
            if (searchSpec.getType() != null && searchSpec.getType() != flower.getMy_spec().getType()) {
                continue;
            }
            flowers_match.add(flwrs[i]);
        }
        return flowers_match;
    }

    public String toString() {
        return Arrays.toString(flwrs);


    }

    @Override
    public String getDescription() {
        return "BOUQUET";
    }

    @Override
    public double price() {
        /*
        This is realisation of implemented method from Fathers class which provide the certain feature couting
         */
        double sum = 0;
        for (Flower flower : flwrs) {
            if (flower != null) {
                sum += flower.getPrice();
            }
        }

        return sum;
    }
}

