package com.example.train;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistApp {
    public static void main(String[] args) {
        
       
        System.out.println("UC2 - Add Passenger Bogies to Train");
       
        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        boolean containsSleeper = passengerBogies.contains("Sleeper");

        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + containsSleeper);

        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");

      

        System.out.println("UC3 - Track Unique Bogie IDs");
      

        Set<String> bogieIds = new HashSet<>();

        // Add IDs (with intentional duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate
        bogieIds.add("BG104");

        System.out.println("\nBogie IDs added (including duplicates): BG101, BG102, BG103, BG101, BG102, BG104");
        System.out.println("Final Unique Bogie IDs (HashSet): " + bogieIds);
        System.out.println("Total unique bogie IDs count: " + bogieIds.size());

        System.out.println("\nUC3 operations completed successfully...");
    }
}