package com.thoughtworks;

public class OrderDish {
    private String itemId;
    private String itemName;
    private int itemNum;
    private double price;
    private double halfPrice;

    public OrderDish() {
    }

    public OrderDish(String itemId, int itemNum) {
        this.itemId = itemId;
        this.itemNum = itemNum;
    }

    public OrderDish(String itemId, String itemName, int itemNum, double price, double halfPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemNum = itemNum;
        this.price = price;
        this.halfPrice = halfPrice;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHalfPrice() {
        return halfPrice;
    }

    public void setHalfPrice(double halfPrice) {
        this.halfPrice = halfPrice;
    }
}
