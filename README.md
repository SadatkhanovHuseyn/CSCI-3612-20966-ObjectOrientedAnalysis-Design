# Random Number Generator Statistics (JAVA)

## Project Overview
This Java program generates random numbers using three different built-in Java random number generators (`java.util.Random`, `Math.random()`, `ThreadLocalRandom`) and analyzes the generated data using descriptive statistics.

The program demonstrates basic **object-oriented programming concepts**, including class definitions, method definitions, class attributes, object instantiation, and accessibility modifiers.

---

## Features
- Generates `n` random numbers in the range `[0, 1)` for selected sample sizes.
- Computes descriptive statistics:
  - Number of elements (n)
  - Mean
  - Sample standard deviation
  - Minimum value
  - Maximum value
- Displays results in a clear tabular format.
- Uses clean and modular **object-oriented design**.

---

## How it works
1. **`populate(int n, int randNumGen)`** – Generates `n` random numbers using the chosen generator.  
2. **`statistics(ArrayList<Double> randomValues)`** – Calculates the statistics of the numbers.  
3. **`display(ArrayList<Double> results, boolean headerOn)`** – Displays statistics in a table.  
4. **`execute()`** – Runs all combinations of sample sizes and generators, producing a total of nine results.

---

## Usage
1. Ensure **Java JDK 17+** is installed.  
2. Open the project in **VS Code** (with Java extensions installed).  
3. Compile and run:
```bash
javac Generator.java
java Generator
