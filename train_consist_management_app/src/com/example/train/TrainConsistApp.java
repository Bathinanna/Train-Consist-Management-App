package com.example.train;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class TrainConsistApp {
	public static void main(String[] args) {



		List<String> passengerBogies = new ArrayList<>();


		System.out.println("UC4 - Maintain Ordered Bogie Consist");

		LinkedList<String> trainConsist = new LinkedList<>();

		// Add bogies in order
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");

		System.out.println("\nInitial Train Consist:");
		System.out.println(trainConsist);

		// Insert Pantry Car at position 2 (0-based index)
		trainConsist.add(2, "Pantry Car");

		System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
		System.out.println(trainConsist);

		// Remove first and last bogie
		trainConsist.removeFirst();
		trainConsist.removeLast();

		System.out.println("\nAfter Removing First and Last Bogie:");
		System.out.println(trainConsist);

		System.out.println("\nUC4 ordered consist operations completed...");

	}
}
