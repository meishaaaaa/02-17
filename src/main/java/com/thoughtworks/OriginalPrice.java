package com.thoughtworks;

public class OriginalPrice implements Promo {
    @Override
    public double count(DishInfo dishInfo) {
        double sum = 0;
        for (int i = 0; i < dishInfo.getItemId().length; i++) {
            sum += dishInfo.getItemNum()[i] * dishInfo.getPrice()[i];
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
        OriginalPrice one = new OriginalPrice();
        int originalPrice = (int) one.count(dishInfo);

        summary += "-----------------------------------\n"
                + String.format("总计：" + originalPrice + "元\n")
                + "===================================";
        return summary;
    }
}

