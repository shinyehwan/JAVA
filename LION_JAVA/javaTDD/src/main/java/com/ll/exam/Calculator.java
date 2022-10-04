package com.ll.exam;

public class Calculator {
    public static int calc(String s) {
//        if (s.equals("10+20")) {
//            return 30;
//        }

        boolean isMulti = s.indexOf("*") != -1;
        boolean isMinus = s.indexOf("-") != -1;



        if (isMinus) {
            return calcMinus(s);
        } else if (isMulti) {
            return calcMulti(s);

        }
        return calcPlus(s);
    }

    private static int calcMulti(String s) {
        String[] sBits = s.split("\\*");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);
        return no1 * no2;
    }

    private static int calcPlus(String s) {
        String[] sBits = s.split("\\+");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);
        return no1 + no2;
    }

    private static int calcMinus(String s) {
        String[] sBits = s.split("\\-");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);
        return no1 - no2;
    }
}
