package com.learning.arrays;

public class StringArray{
    public static void main(String[] args) {
           String[] animals = {"cat","rat","dog","tiger","lion","panda","pig"};

           System.out.println(animals[animals.length-1]);

           System.out.println(animals[0]);

           System.out.println(animals[animals.length/2]);

           months();
    }

    private static void months() {
            String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

            System.out.println(monthNames[0]);

            System.out.println(monthNames[monthNames.length-1]);

            System.out.println(monthNames[monthNames.length/2 - 1]);

            System.out.println(monthNames[monthNames.length/2]);

            System.out.println(monthNames[monthNames.length/2 + 1]);

    }

}
