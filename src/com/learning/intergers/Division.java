package com.learning.intergers;

public class Division {
    public static void main(String[] args) {
        int first = 4;
        int second = 4;
        int totalNumber = (first / second);
        System.out.println("TotalNumber = " + totalNumber);

        floatNumber();
    }

    public static void floatNumber() {
        float first = 5.2f;
        float second = 4.6f;
        float totalNumber = (first / second);
       String s1 = String.format("%.2f",totalNumber); // using string formatting to limit decimal places of the result
        System.out.println("TotalNumber = " + s1);


        // or we can simply use
        System.out.println("TotalNumber = " + totalNumber);

    }

}
