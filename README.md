# Random Number Generator Statistics (JAVA)

## Project Overview
This project implements a Java program that generates random numbers using multiple built-in Java random number generators and analyzes the generated data using descriptive statistics.

The goal of the assignment is to compare the statistical behavior of different random number generation approaches as the sample size increases.

The program generates random double values in the range **[0, 1)** and computes the following statistics:
    -Sample size (n)
    -Mean
    -Sample standard deviation
    -Minimum value
    -Maxmum value
---

## Random Number Generators Used
The program compares the following Java random number generators:

1. `java.util.Random`
2. `Math.random()`
3. `java.util.concurrent.ThreadLocalRandom`

Each generator is tested with multiple sample sizes to observe statistical behavior.

---

## Program Structure
The program consists of a **single Java class** named `Generator`, as required.

### Class: `Generator`
Responsibilities:
- Generate random numbers
- Compute descriptive statistics
- Display results in a formatted table
- Coordinate execution of all experiments

### Methods
- `populate(int n, int randNumGen)`  
  Generates `n` random numbers using the selected random number generator.

- `statistics(ArrayList<Double> randomValues)`  
  Computes and returns the statistics in the following order:
  [n, mean, sample standard deviation, min, max]
  
- `display(ArrayList<Double> results, boolean headerOn)`  
Displays results in a tabular format in the system console.

- `execute()`  
Coordinates execution of all experiments and produces all results.

- `main(String[] args)`  
Minimal entry point that creates a `Generator` object and calls `execute()`.

---

## Object-Oriented Concepts Demonstrated
The code explicitly highlights examples of:
- Class definition
- Method definitions
- Class attributes
- Object instantiation
- Access modifiers (`public`, `private`)

These concepts are clearly marked using comments in the source code.

---

## How to Run the Program

### Requirements
- Java Development Kit (JDK) 17 or later
- A Java-compatible IDE or terminal (e.g., VS Code)

---

### Running from the Terminal
1. Navigate to the project directory:
 ```bash
 cd RandomGeneratorProject
