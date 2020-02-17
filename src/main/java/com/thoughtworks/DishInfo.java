package com.thoughtworks;

import java.util.Arrays;
import java.util.List;

public class DishInfo {
    private String[] itemId;
    private String[] itemName;
    private int[] itemNum;
    private double[] price;
    private double[] halfPrice;


    public DishInfo() {
    }

    public DishInfo(String[] itemId, String[] itemName, int[] itemNum, double[] price, double[]halfPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemNum = itemNum;
        this.price = price;
        this.halfPrice = halfPrice;
    }

    public void setItemId() {
        List<Dish>list=DataProvider.getDishes();
        String[]itemId=new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            itemId[i] = list.get(i).getId();
        }
        this.itemId=itemId;
    }

    public void setItemName() {
        List<Dish>list=DataProvider.getDishes();
        String[]itemName=new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            itemName[i] = list.get(i).getName();
        }
        this.itemName=itemName;
    }

    public void setItemNum(String[] dishArr, int[] dishNum) {
        List<Dish>list=DataProvider.getDishes();
        int[] itemNum=new int[list.size()];
        for (int i = 0; i<list.size(); i++) {
            for (int j = 0; j<dishArr.length;j++) {
                if (list.get(i).getId().equals(dishArr[j])){
                    itemNum[i] = dishNum[j];
                    break;
                }
                else{itemNum[i]=0;}

            }
        }
        this.itemNum=itemNum;
    }

    public void setPrice() {
        List<Dish>list=DataProvider.getDishes();
        double[]price=new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            price[i] = list.get(i).getPrice();
        }
        this.price=price;
    }

    public void setHalfPrice() {
        List<Dish>list=DataProvider.getDishes();
        List<String>list2=DataProvider.getHalfDishIds();
        double[]price=new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list.get(i).getId().equals(list2.get(j))) {
                    price[i] = list.get(i).getPrice() * 0.5;
                    break;
                } else {
                    price[i] = list.get(i).getPrice();
                }
            }
        }
        this.halfPrice=price;
    }

    public String[] getItemId() {
        return itemId;
    }

    public String[] getItemName() {
        return itemName;
    }

    public int[] getItemNum() {
        return itemNum;
    }

    public double[] getPrice() {
        return price;
    }

    public double[] getHalfPrice() {
        return halfPrice;
    }


    public String halfDish(DishInfo dishInfo){
        String halfDish=null;
        if (dishInfo.getItemNum()[0]!=0 && dishInfo.getItemNum()[2]!=0){
            halfDish = dishInfo.getItemName()[0]+"，"+dishInfo.getItemName()[2];
        }
        else if (dishInfo.getItemNum()[0]!=0){
            halfDish = dishInfo.getItemName()[0];
        }

        else if (dishInfo.getItemNum()[2]!=0){
            halfDish = dishInfo.getItemName()[2];
        }

        return halfDish;
    }

    @Override
    public String toString() {
        return "DishInfo{" +
                "itemId=" + Arrays.toString(itemId) +
                ", itemName=" + Arrays.toString(itemName) +
                ", itemNum=" + Arrays.toString(itemNum) +
                ", price=" + Arrays.toString(price) +
                '}';
    }
}
