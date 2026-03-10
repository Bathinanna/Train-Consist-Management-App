package com.example.train;

import java.util.HashMap;
import java.util.Map;
/*
*@author developer
*version 6.0
*/
public class TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        

        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogie -> capacity mapping
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 120);
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);

        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}