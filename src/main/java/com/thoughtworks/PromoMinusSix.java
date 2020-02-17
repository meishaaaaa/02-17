package com.thoughtworks;

public class PromoMinusSix implements Promo {
    @Override
    public double count(DishInfo dishInfo) {
        double sum = 0;
        for (int i = 0; i < dishInfo.getItemId().length; i++) {
            sum += dishInfo.getItemNum()[i] * dishInfo.getPrice()[i];
        }
        if (sum >= 30) {
            sum -= 6;
        }
        return sum;

    }
}
