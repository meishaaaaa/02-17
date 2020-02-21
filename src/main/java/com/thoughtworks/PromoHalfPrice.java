package com.thoughtworks;

import java.util.ArrayList;

public class PromoHalfPrice implements Promo {
    @Override
    public double count(ArrayList<OrderDish> orderList) {
        double sum = 0;
        for (int i = 0; i < orderList.size(); i++) {
            sum += orderList.get(i).getHalfPrice() * orderList.get(i).getItemNum();
        }
        return sum;
    }


    @Override
    public String summary(ArrayList<OrderDish> orderList) {
        StringBuilder summary = new StringBuilder("============= 订餐明细 =============\n");
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getItemNum() != 0) {
                int eachDishPrice = (int) (orderList.get(i).getPrice() * orderList.get(i).getItemNum());
                summary.append(orderList.get(i).getItemName() + " x " + orderList.get(i).getItemNum() + " = "
                        + eachDishPrice + "元\n");
            }
        }

        OriginalPrice original = new OriginalPrice();
        PromoHalfPrice half = new PromoHalfPrice();

        int originalPrice = (int) original.count(orderList);
        int halfPrice = (int) half.count(orderList);

        int saveMoney1 = originalPrice - halfPrice;
        String halfDish = DishList.halfDishes(orderList);
        summary.append("-----------------------------------\n")
                .append("使用优惠:\n")
                .append("指定菜品半价(" + halfDish + ")，" + "省" + saveMoney1 + "元\n")
                .append("-----------------------------------\n")
                .append("总计：" + halfPrice + "元\n")
                .append("===================================");

        String s1 = summary.toString();
        return s1;
    }
}
