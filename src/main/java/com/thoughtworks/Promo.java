package com.thoughtworks;

import java.util.ArrayList;

public interface Promo {

    double count(ArrayList<OrderDish> orderList);

    String summary(ArrayList<OrderDish> orderList);

}
