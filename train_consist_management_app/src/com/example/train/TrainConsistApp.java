package com.example.train;

/*
 * @author developer
 * @version 12.0
 * Added SafetyCompliance to Train Consist Management App 
 * 
 */


import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    // Goods Bogie model
    static class GoodsBogie {
        private String type;   // Rectangular / Cylindrical
        private String cargo;  // Coal / Petroleum / etc.

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return "Type=" + type + ", Cargo=" + cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("======================================");

        // Prepare goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Cement"));
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // Uncomment to test invalid case

        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Safety rule:
        // If type is Cylindrical, cargo must be Petroleum
        boolean isSafetyCompliant = goodsBogies.stream().allMatch(bogie ->
                !"Cylindrical".equalsIgnoreCase(bogie.getType()) ||
                "Petroleum".equalsIgnoreCase(bogie.getCargo())
        );

        System.out.println("\nSafety Compliance Status: " +
                (isSafetyCompliant ? "SAFE ✅" : "NOT SAFE ❌"));

        System.out.println("\nRule Applied:");
        System.out.println("Cylindrical bogie -> only Petroleum allowed");

        System.out.println("\nUC12 safety validation completed...");
    }
}