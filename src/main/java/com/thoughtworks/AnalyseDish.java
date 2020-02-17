package com.thoughtworks;

public class AnalyseDish {
    //用于解析来自其他地方的信息，输出接受来的菜色和数量


    public String[] dishArr(String selectedItems) {
        String[] Arr = selectedItems.split(",");
        String[] dishArr = new String[Arr.length];
        for (int i = 0; i < Arr.length; i++) {
            dishArr[i] = Arr[i].substring(0, 8);
        }
        return dishArr;
    }

    public int[] numArr(String selectedItems) {
        String[] Arr = selectedItems.split(",");
        int[] numArr = new int[Arr.length];
        for (int i = 0; i < Arr.length; i++) {
            numArr[i] = Integer.parseInt(Arr[i].substring(11));
        }
        return numArr;
    }

}
