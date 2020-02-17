package com.thoughtworks;

public class FinalPrice {
    //比较三个promotion方案哪个最小
    public String summary(DishInfo dishInfo){
        OriginalPrice one = new OriginalPrice();
        PromoHalfPrice two=new PromoHalfPrice();
        PromoMinusSix three=new PromoMinusSix();

        int originalPrice=(int)one.count(dishInfo);
        int halfPrice=(int)two.count(dishInfo);
        int minusPrice=(int)three.count(dishInfo);

        String summary = "============= 订餐明细 =============\n";

        for (int i = 0; i < dishInfo.getItemName().length; i++) {
            if (dishInfo.getItemNum()[i] != 0) {
                int eachDishPrice = (int)(dishInfo.getPrice()[i]*dishInfo.getItemNum()[i]);
                summary += String.format(dishInfo.getItemName()[i] + " x " + dishInfo.getItemNum()[i] + " = "
                        + eachDishPrice + "元\n");
            }
        }

        if (originalPrice == halfPrice && originalPrice == minusPrice ){
            summary +="-----------------------------------\n"
                    + String.format("总计：" + originalPrice + "元\n")
                    + "===================================";
        }
        else if (halfPrice<=minusPrice) {
            int saveMoney1 = originalPrice - halfPrice;
            String halfDish = dishInfo.halfDish(dishInfo);
            summary += "-----------------------------------\n"
                    + "使用优惠:\n"
                    + String.format("指定菜品半价(" + halfDish + ")，" + "省" + saveMoney1 + "元\n")
                    + "-----------------------------------\n"
                    + String.format("总计：%d元\n", halfPrice)
                    + "===================================";
        }
            else {
                summary += "-----------------------------------\n"
                        + "使用优惠:\n"
                        + String.format("满30减6元，省6元\n")
                        + "-----------------------------------\n"
                        + String.format("总计：%d元\n", minusPrice)
                        + "===================================";
            }
            return summary;
            }
        }


