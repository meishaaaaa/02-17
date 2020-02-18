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
        PromoHalfPrice two = new PromoHalfPrice();

        int originalPrice = (int) one.count(dishInfo);
        int halfPrice = (int) two.count(dishInfo);

        int saveMoney1 = originalPrice - halfPrice;
        String halfDish = dishInfo.halfDish(dishInfo);
        summary += "-----------------------------------\n"
                + "使用优惠:\n"
                + String.format("指定菜品半价(" + halfDish + ")，" + "省" + saveMoney1 + "元\n")
                + "-----------------------------------\n"
                + String.format("总计：%d元\n", halfPrice)
                + "===================================";
        return summary;
    }
}
