package com.example.train;


/*
*@author developer
*version 7.0
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsistApp {

    // UC7: Custom object for bogie
    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("======================================");

        // Create and store bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Sort by capacity (ascending)
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }

        System.out.println("\nUC7 sorting completed successfully...");
    }
}