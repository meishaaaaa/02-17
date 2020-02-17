package com.thoughtworks;

public class PromoHalfPrice implements Promo {
    @Override
    public double count(DishInfo dishInfo) {
        double sum = 0;
        for (int i = 0; i < dishInfo.getItemId().length; i++) {
            sum += dishInfo.getItemNum()[i] * dishInfo.getHalfPrice()[i];
        }
        return sum;

    }
}
