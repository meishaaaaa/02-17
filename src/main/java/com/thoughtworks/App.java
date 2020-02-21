package com.thoughtworks;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String selectedItems="ITEM0001 x 1,ITEM0013 x 2,ITEM0022 x 1";

        AnalyseDish analyseDish = new AnalyseDish();
        System.out.println(analyseDish.analyse(selectedItems));

    }
}


