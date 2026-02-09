/*
 * Name: Huseyn Sadatkhanov
 * Project: Random Number Generator & Statistics
 * Class: Object Oriented Analysis & Design
 * Date: 2026-02-09
 */
import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * This class generates random numbers using different generators
 * and computes basic descriptive statistics.
 */
public class Generator {

    /*
     * Used for java.util.Random generator
     */
    private Random random = new Random();   // Accessibility: private

    /*
     * ===== METHOD DEFINITION =====
     * Generates n random numbers using the selected generator.
     * randNumGen:
     * 1 -> java.util.Random
     * 2 -> Math.random()
     * 3 -> ThreadLocalRandom
     */
    public ArrayList<Double> populate(int n, int randNumGen) {
        ArrayList<Double> values = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double num;

            if (randNumGen == 1) {
                num = random.nextDouble();
            } else if (randNumGen == 2) {
                num = Math.random();
            } else {
                num = ThreadLocalRandom.current().nextDouble();
            }

            values.add(num);
        }

        return values;
    }

    /*
     * Calculates statistics:
     * n, mean, sample standard deviation, min, max
     */
    public ArrayList<Double> statistics(ArrayList<Double> randomValues) {
        int n = randomValues.size();
        double sum = 0;
        double min = randomValues.get(0);
        double max = randomValues.get(0);

        for (double x : randomValues) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }

        double mean = sum / n;

        double varianceSum = 0;
        for (double x : randomValues) {
            varianceSum += Math.pow(x - mean, 2);
        }

        double stddev = Math.sqrt(varianceSum / (n - 1)); // sample std dev

        ArrayList<Double> results = new ArrayList<>();
        results.add((double) n);
        results.add(mean);
        results.add(stddev);
        results.add(min);
        results.add(max);

        return results;
    }

    /*
     * Displays results in tabular form
     */
    public void display(ArrayList<Double> results, boolean headerOn) {
        if (headerOn) {
            System.out.printf("%-8s %-10s %-10s %-10s %-10s%n",
                    "n", "mean", "stddev", "min", "max");
        }

        System.out.printf("%-8.0f %-10.4f %-10.4f %-10.4f %-10.4f%n",
                results.get(0),
                results.get(1),
                results.get(2),
                results.get(3),
                results.get(4));
    }

    /*
     * Executes all cases:3 generators × 3 sample sizes = 9 results
     */
    public void execute() {
        int[] nValues = {10, 100, 1000};

        for (int gen = 1; gen <= 3; gen++) {
            System.out.println("\nGenerator: " + gen);
            boolean header = true;

            for (int n : nValues) {
                ArrayList<Double> data = populate(n, gen);
                ArrayList<Double> stats = statistics(data);
                display(stats, header);
                header = false;
            }
        }
    }

    public static void main(String[] args) {
        Generator g = new Generator(); // Object instantiation
        g.execute();
    }
}
