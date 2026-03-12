package com.example.train;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @author developer
 * @version 9.0
 * Coded Grouping 
 */

import java.util.Map;

public class TrainConsistApp {

    static class Bogie {
        private String name;
        private int capacity;
        private String type; // Passenger or Goods

        public Bogie(String name, int capacity, String type) {
            this.name = name;
            this.capacity = capacity;
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("======================================");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Cargo", 120, "Goods"));
        bogies.add(new Bogie("Oil Tanker", 80, "Goods"));

        // Group by bogie type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogie Structure:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " : " + list);
        });

        System.out.println("\nUC9 grouping completed successfully...");
    }
}