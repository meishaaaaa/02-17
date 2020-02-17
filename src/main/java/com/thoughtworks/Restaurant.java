package com.thoughtworks;

public class Restaurant {

  public String bestCharge(String selectedItems) {

    AnalyseDish one = new AnalyseDish();
    DishInfo two = new DishInfo();
    two.setItemId();
    two.setItemName();
    two.setItemNum(one.dishArr(selectedItems), one.numArr(selectedItems));
    two.setPrice();
    two.setHalfPrice();

    FinalPrice print=new FinalPrice();
    String bestCharge=print.summary(two);

    return bestCharge;
  }
}
