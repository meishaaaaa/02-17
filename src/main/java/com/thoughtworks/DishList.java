package com.thoughtworks;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;


public class DishList {

    //分析并获取全价菜单和点菜数量的list
    public ArrayList<OrderDish> setItem(ArrayList<OrderDish> analyseDish) {
        List<Dish> list = DataProvider.getDishes();
        List<String> list2 = DataProvider.getHalfDishIds();
        ArrayList<OrderDish> orderList = new ArrayList<>();
        for (Dish dish : list) {
            OrderDish order = new OrderDish();
            order.setItemId(dish.getId());
            order.setItemName(dish.getName());
            order.setPrice(dish.getPrice());
            order.setHalfPrice(dish.getPrice());
            order.setItemNum(0);

            for (int i = 0; i < list2.size(); i++) {
                if (dish.getId().equals(list2.get(i))) {
                    order.setHalfPrice(dish.getPrice() * 0.5);
                }
            }

            for (OrderDish orderDish : analyseDish) {
                if (order.getItemId().equals(orderDish.getItemId())) {
                    order.setItemNum(orderDish.getItemNum());
                }
            }
            orderList.add(order);
        }
        return orderList;
    }

    //获取半价菜品的字符串
    public static String halfDishes(ArrayList<OrderDish> orderList) {
        StringBuilder half1 = new StringBuilder();
        for (OrderDish order : orderList) {
            for (int i = 0; i < DataProvider.getHalfDishIds().size(); i++) {
                if ((order.getItemNum() != 0) && order.getItemId().equals(DataProvider.getHalfDishIds().get(i))) {
                    half1.append(order.getItemName()).append("，");
                }
            }
        }
        String half = half1.deleteCharAt(half1.length() - 1).toString();
        return half;
    }
}
