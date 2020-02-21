package com.thoughtworks;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import java.util.ArrayList;

public class Restaurant {

    public String bestCharge(String selectedItems) {

        AnalyseDish analyseDish = new AnalyseDish();
        ArrayList<OrderDish> analyse = analyseDish.analyse(selectedItems);

        DishList dishList = new DishList();

        FinalPrice finalP = new FinalPrice();

        String bestCharge = finalP.finalPrice(dishList.setItem(analyse));

        return bestCharge;
    }
}
