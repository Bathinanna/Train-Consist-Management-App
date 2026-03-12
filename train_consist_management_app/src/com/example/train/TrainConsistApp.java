package com.example.train;

/*
 * @author developer
 * @version 13.0
 * Added Performance Comparsion metric  to Train Consist Management App 
 * 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("======================================");

        // Test data: large collection of bogies
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 200_000; i++) {
            int capacity = (i % 4 == 0) ? 72 : (i % 3 == 0) ? 56 : 24;
            bogies.add(new Bogie("Bogie-" + i, capacity));
        }

        // -------------------------------
        // Loop-based filtering benchmark
        // -------------------------------
        long loopStart = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.getCapacity() > 60) {
                loopFiltered.add(bogie);
            }
        }

        long loopEnd = System.nanoTime();
        long loopElapsed = loopEnd - loopStart;

        // --------------------------------
        // Stream-based filtering benchmark
        // --------------------------------
        long streamStart = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamElapsed = streamEnd - streamStart;

        // Output results
        System.out.println("\nFiltered Count (Loop)   : " + loopFiltered.size());
        System.out.println("Filtered Count (Stream) : " + streamFiltered.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop   : " + loopElapsed + " ns");
        System.out.println("Stream : " + streamElapsed + " ns");

        if (loopElapsed < streamElapsed) {
            System.out.println("\nResult: Loop is faster in this run.");
        } else if (streamElapsed < loopElapsed) {
            System.out.println("\nResult: Stream is faster in this run.");
        } else {
            System.out.println("\nResult: Both took the same time in this run.");
        }

        System.out.println("\nUC13 benchmarking completed...");
    }
}