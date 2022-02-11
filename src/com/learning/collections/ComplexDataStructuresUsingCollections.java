package com.learning.collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructuresUsingCollections {

    public static String[] vehicles = {"ambulance", "helicopter", "lifeboat"};
    public static String[][] drivers = {{"ram", "kiran"}, {"rekha", "neha", "pinky"}, {"ted", "bud", "eddy", "kavya"}};

    public static void main(String[] args) {

        Map<String, Set<String>> personnel = new HashMap<>();
        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];
           // System.out.println(vehicle);

            Set<String> driverSet = new LinkedHashSet<>();
            for(String driver : driversList){
                driverSet.add(driver);
            }
            personnel.put(vehicle,driverSet);
        }
        System.out.println(personnel);

        //iterate through the whole thing
        for(String vehicle : personnel.keySet()){
            System.out.print(vehicle + ":");
            Set<String> listOfDrivers = personnel.get(vehicle);
            for(String driver : listOfDrivers){
                System.out.print(driver + " ");
            }
            System.out.println();
        }
    }
}
