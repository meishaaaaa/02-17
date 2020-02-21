package com.thoughtworks;

import java.util.ArrayList;

public class FinalPrice {
    //比较三个promotion方案哪个最小
    public String finalPrice(ArrayList<OrderDish> orderList) {
        OriginalPrice original = new OriginalPrice();
        PromoHalfPrice half = new PromoHalfPrice();
        PromoMinusSix minus = new PromoMinusSix();

        int originalPrice = (int) original.count(orderList);
        int halfPrice = (int) half.count(orderList);
        int minusPrice = (int) minus.count(orderList);

        String finalPrice=null;

        if (originalPrice == halfPrice && originalPrice == minusPrice) {
            finalPrice=original.summary(orderList);
        } else if (halfPrice <= minusPrice) {
            finalPrice=half.summary(orderList);
        } else {
           finalPrice=minus.summary(orderList);
        }
        return finalPrice;
    }
}


