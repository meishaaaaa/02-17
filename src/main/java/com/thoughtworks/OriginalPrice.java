package com.thoughtworks;

import java.util.ArrayList;

public class OriginalPrice implements Promo {

    @Override
    public double count(ArrayList<OrderDish> orderList) {
        double sum = 0;
        for (int i = 0; i < orderList.size(); i++) {
            sum += orderList.get(i).getPrice() * orderList.get(i).getItemNum();
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
        int originalPrice = (int) original.count(orderList);
        summary.append("-----------------------------------\n")
                .append("总计：" + originalPrice + "元\n")
                .append("===================================");
        String s1 = summary.toString();
        return s1;
    }
}

