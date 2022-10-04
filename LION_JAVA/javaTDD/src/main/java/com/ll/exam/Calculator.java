package com.ll.exam;

public class Calculator {
    public static int add(String s) {
//        if (s.equals("10+20")) {
//            return 30;
//        }
        String[] sBits = s.split("\\+");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);
        return no1+no2;
    }
}
