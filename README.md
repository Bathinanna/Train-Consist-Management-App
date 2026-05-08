# Train Consist Management App

A **console-based Java application** that simulates how railway systems manage a **train consist** — the ordered collection of bogies attached to a locomotive.

The application demonstrates **Java programming concepts, collections, algorithms, streams, regex validation, and exception handling** through realistic railway scenarios.

Each **Use Case (UC)** introduces one or more Java concepts while modeling real-world train operations such as **bogie attachment, cargo validation, capacity tracking, searching, sorting, and safety compliance.**

---

# 📌 Features

The application supports:

* Passenger bogies *(Sleeper, AC Chair, First Class)* with seat capacity tracking
* Goods bogies *(Rectangular, Cylindrical)* with cargo type validation
* Train formation management
* Capacity analytics and reporting
* Safety validation for cargo
* Searching and sorting bogies
* Exception handling for invalid operations
* Performance comparison of loops vs streams

---

# 🛠 Technologies Used

* **Java**
* **Java Collections Framework**
* **Java Stream API**
* **Regular Expressions (Regex)**
* **Custom Exceptions**
* **Sorting & Searching Algorithms**
* **Functional Programming (Lambda Expressions)**

---

# 🧠 Learning Objectives

This project demonstrates:

* Core Java programming
* Data structures and algorithms
* Java Collections Framework
* Stream API and functional programming
* Input validation using Regex
* Exception handling
* Defensive programming
* Performance benchmarking

---

# 📂 Project Structure

```
TrainConsistManagementApp
│
├── TrainApp.java
├── Bogie.java
├── GoodsBogie.java
├── PassengerBogie.java
├── Exceptions
│   ├── InvalidCapacityException.java
│   └── CargoSafetyException.java
└── README.md
```

---

# 🚆 Use Cases

## UC1 — Initialize Train and Display Consist Summary

Initializes the application and displays the train consist.

**Concepts**

* Class and Main Method
* Static keyword
* ArrayList initialization
* Console output

---

## UC2 — Add Passenger Bogies to Train (ArrayList)

Allows adding and removing passenger bogies dynamically.

**Concepts**

* ArrayList
* add()
* remove()
* contains()
* CRUD operations

---

## UC3 — Track Unique Bogie IDs (HashSet)

Ensures that bogie IDs remain **unique**.

**Concepts**

* Set Interface
* HashSet
* Duplicate elimination

---

## UC4 — Maintain Ordered Bogie IDs (LinkedList)

Models the physical order of a train consist.

**Concepts**

* LinkedList
* addFirst()
* addLast()
* removeFirst()
* removeLast()

---

## UC5 — Preserve Insertion Order (LinkedHashSet)

Ensures **uniqueness while maintaining insertion order**.

**Concepts**

* LinkedHashSet
* Ordered iteration
* Automatic deduplication

---

## UC6 — Map Bogie to Capacity (HashMap)

Associates each bogie with seating or cargo capacity.

**Concepts**

* HashMap
* Map interface
* key-value mapping
* entrySet()

---

## UC7 — Sort Bogies by Capacity (Comparator)

Sorts passenger bogies using custom comparison logic.

**Concepts**

* Comparator
* Custom objects
* Lambda expressions
* List sorting

---

## UC8 — Filter Passenger Bogies (Streams)

Filters bogies using Java Stream API.

**Concepts**

* Stream API
* filter()
* collect()
* Lambda expressions

---

## UC9 — Group Bogies by Type

Groups bogies by category.

**Concepts**

* Collectors.groupingBy()
* Stream transformation
* Map grouping

---

## UC10 — Count Total Seats (reduce)

Calculates total seating capacity.

**Concepts**

* map()
* reduce()
* Integer::sum

---

## UC11 — Validate Train ID & Cargo Codes (Regex)

Ensures valid format for train and cargo identifiers.

**Concepts**

* Regex
* Pattern
* Matcher
* Input validation

---

## UC12 — Safety Compliance Check

Ensures cargo is assigned to correct bogie type.

Example rule:

```
Cylindrical bogie → Petroleum only
```

**Concepts**

* Streams
* allMatch()
* Business rule validation

---

## UC13 — Performance Comparison (Loops vs Streams)

Benchmarks performance using high-resolution timing.

**Concepts**

* System.nanoTime()
* Loop vs Stream comparison
* Micro benchmarking

---

## UC14 — Handle Invalid Bogie Capacity (Custom Exception)

Prevents creation of invalid passenger bogies.

**Concepts**

* Custom exceptions
* throw
* throws
* Fail-fast validation

---

## UC15 — Safe Cargo Assignment (try-catch-finally)

Handles unsafe cargo assignments gracefully.

**Concepts**

* try-catch-finally
* Runtime exceptions
* Graceful failure handling

---

## UC16 — Manual Sorting (Bubble Sort)

Introduces algorithmic sorting without libraries.

**Concepts**

* Bubble Sort
* Nested loops
* Swapping logic
* O(n²) complexity

---

## UC17 — Sort Bogie Names (Arrays.sort)

Uses optimized Java sorting utilities.

**Concepts**

* Arrays.sort()
* Natural ordering
* O(n log n)

---

## UC18 — Linear Search for Bogie ID

Searches unsorted data sequentially.

**Concepts**

* Linear search
* Sequential traversal
* O(n)

---

## UC19 — Binary Search for Bogie ID

Optimized search on sorted data.

**Concepts**

* Binary search
* Divide and conquer
* O(log n)

---

## UC20 — Exception Handling During Search

Prevents searching when the train has no bogies.

**Concepts**

* Defensive programming
* IllegalStateException
* Fail-fast principle

---

# 📊 Concepts Covered

## Data Structures

* Arrays
* ArrayList
* LinkedList
* HashSet
* LinkedHashSet
* HashMap

## Algorithms

* Bubble Sort
* Arrays.sort()
* Linear Search
* Binary Search

## Java Functional Features

* Lambda Expressions
* Stream API
* Collectors
* Method references

## Exception Handling

* Checked exceptions
* Runtime exceptions
* Custom exceptions
* try-catch-finally

## Validation

* Regular Expressions
* Pattern & Matcher

---

# ⚡ Performance Concepts

* Time complexity awareness
* System.nanoTime() benchmarking
* Loop vs Stream comparison

---

# 📈 Benefits of the Project

* Demonstrates **real-world railway system modeling**
* Covers **core Java + advanced Java**
* Teaches **Data Structures & Algorithms**
* Introduces **functional programming in Java**
* Encourages **clean coding and defensive programming**
