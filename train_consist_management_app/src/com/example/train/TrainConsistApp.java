package com.example.train;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @author developer
 * @version 10.0
 * Aggregation using reduce() 
 */



public class TrainConsistApp {

    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
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
        System.out.println("UC10 - Count Total Seats in Train (reduce)");
        System.out.println("======================================");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 108));

        // map() + reduce() to compute total seating capacity
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        System.out.println("\nBogie Details:");
        bogies.forEach(System.out::println);

        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 aggregation completed successfully...");
    }
}