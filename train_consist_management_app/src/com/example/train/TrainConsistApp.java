package com.example.train;

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("UC5 - Preserve Insertion Order of Bogies");

        // LinkedHashSet: unique + preserves insertion order
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Intentional duplicate
        trainFormation.add("Sleeper");

        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}