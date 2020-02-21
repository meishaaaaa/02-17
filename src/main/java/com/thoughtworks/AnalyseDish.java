package com.thoughtworks;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import java.util.ArrayList;

public class AnalyseDish {
    //用于解析来自其他地方的信息，输出接受来的菜色和数量



    public ArrayList<OrderDish> analyse(String selectedItems ) {
        String[] arr = selectedItems.split(",");
        ArrayList<OrderDish> analyseList = new ArrayList(arr.length);
        for (String item : arr) {
            String[] idAndNum = item.split(" x ");
            String id=idAndNum[0];
            int num=Integer.parseInt(idAndNum[1]);
            OrderDish order=new OrderDish();
            order.setItemId(id);
            order.setItemNum(num);
            analyseList.add(order);
        }
        return analyseList;
    }
}
