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

    @Override
    public String summary(DishInfo dishInfo) {
        String summary = "============= 订餐明细 =============\n";
        for (int i = 0; i < dishInfo.getItemName().length; i++) {
            if (dishInfo.getItemNum()[i] != 0) {
                int eachDishPrice = (int) (dishInfo.getPrice()[i] * dishInfo.getItemNum()[i]);
                summary += String.format(dishInfo.getItemName()[i] + " x " + dishInfo.getItemNum()[i] + " = "
                        + eachDishPrice + "元\n");
            }
        }

        PromoMinusSix three = new PromoMinusSix();
        int minusPrice = (int) three.count(dishInfo);

        summary += "-----------------------------------\n"
                + "使用优惠:\n"
                + String.format("满30减6元，省6元\n")
                + "-----------------------------------\n"
                + String.format("总计：%d元\n", minusPrice)
                + "===================================";

        return summary;
    }
}
