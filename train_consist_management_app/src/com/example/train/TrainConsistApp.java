package com.example.train;

/*
 * @author developer
 * @version 11.0
 * Regex Operations are done Here .
 * 
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("UC11 - Validate Train ID & Cargo Codes (Regex)");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("\nEnter Train ID (format: TRN-1234): ");
        String trainId = scanner.nextLine().trim();

        System.out.print("Enter Cargo Code (format: PET-AB): ");
        String cargoCode = scanner.nextLine().trim();

        // Regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate
        boolean isTrainIdValid = trainMatcher.matches();
        boolean isCargoCodeValid = cargoMatcher.matches();

        System.out.println("\nValidation Results:");
        System.out.println("Train ID '" + trainId + "' is " + (isTrainIdValid ? "VALID" : "INVALID"));
        System.out.println("Cargo Code '" + cargoCode + "' is " + (isCargoCodeValid ? "VALID" : "INVALID"));

        if (!isTrainIdValid) {
            System.out.println("Error: Train ID must match format TRN-1234");
        }
        if (!isCargoCodeValid) {
            System.out.println("Error: Cargo Code must match format PET-AB");
        }

        System.out.println("\nUC11 validation completed...");
        scanner.close();
    }
}