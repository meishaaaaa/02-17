package com.thoughtworks;

public class FinalPrice {
    //比较三个promotion方案哪个最小
    public String finalPrice(DishInfo dishInfo) {
        OriginalPrice one = new OriginalPrice();
        PromoHalfPrice two = new PromoHalfPrice();
        PromoMinusSix three = new PromoMinusSix();

        int originalPrice = (int) one.count(dishInfo);
        int halfPrice = (int) two.count(dishInfo);
        int minusPrice = (int) three.count(dishInfo);

        String finalPrice;

        if (originalPrice == halfPrice && originalPrice == minusPrice) {
            finalPrice=one.summary(dishInfo);
        } else if (halfPrice <= minusPrice) {
            finalPrice=two.summary(dishInfo);
        } else {
           finalPrice=three.summary(dishInfo);
        }
        return finalPrice;
    }
}


