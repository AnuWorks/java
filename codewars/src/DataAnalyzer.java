/*
 * Task:
 * 
 * Create a program that:
 * 
 * Reads a list of integers from a file (e.g., "input.txt"). Calculates and prints: The sum of all
 * the integers. The average of the integers. The median of the integers. The number of occurrences
 * of each unique integer. Writes the results to another file (e.g., "output.txt"). Key
 * Considerations:
 * 
 * Use Java 21 features: Records: Represent the results of the calculations as a record for better
 * readability and maintainability. Text Blocks: Use text blocks for improved readability of
 * multi-line output. Pattern Matching for instanceof: Utilize pattern matching for instanceof to
 * simplify type checks. Sealed Interfaces: (If applicable) If you're defining any custom
 * interfaces, consider using sealed interfaces to restrict which classes can implement them. Handle
 * potential exceptions: IOException: Handle potential exceptions during file reading and writing.
 * NumberFormatException: Handle potential exceptions if the input file contains invalid data.
 * Consider using streams: Leverage the power of Java streams for efficient data processing.
 * 
 */


import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class DataAnalyzer {

    public record AnalysisResults(int sum, double average, double median,
            Map<Integer, Long> occurrences) {
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            List<Integer> numbers = readNumbersFromFile(inputFile);
            AnalysisResults results = analyzeData(numbers);
            writeResultsToFile(results, outputFile);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error processing data: " + e.getMessage());
        }
    }

    // ... implementation of readNumbersFromFile, analyzeData, writeResultsToFile ...

    public static List<Integer> readNumbersFromFile(String inputFile) throws IOException {

        List<Integer> numbers = new ArrayList<>();
        try {
            Files.readAllLines(new File(inputFile).toPath()).stream().flatMap(String::lines) 
                    .map(String::strip) // Trim whitespace
                    .filter(line -> !line.isEmpty()) // Ignore empty lines
                    .mapToInt(Integer::parseInt) // Convert each line to an integer
                    .forEach(numbers::add);

        } catch (IOException e) {
            throw new IOException("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number format: " + e.getMessage());
        }
        numbers.forEach(System.out::println);
        return numbers;
    }

    public static AnalysisResults analyzeData(List<Integer> numbers) throws NumberFormatException {

        return new AnalysisResults(numbers.stream().reduce(0, (a, b) -> a + b),
                numbers.stream().mapToInt(Integer::intValue).average().getAsDouble(),
                findMedian(numbers), null);

    }

    public static double findMedian(List<Integer> numbers) {
        /*
         * To calculate the median of numbers using the Java Stream API, there is no direct method
         * like average(). However, you can compute the median by following these steps:
         * 
         * Sort the Numbers: The median requires a sorted dataset. Find the Middle Element(s): If
         * the number of elements is odd, the median is the middle element. If the number of
         * elements is even, the median is the average of the two middle elements.
         */

        List<Integer> sortedIntegers = numbers.stream().sorted().toList();
        int size = sortedIntegers.size();
        double median;
        if (size % 2 != 0) {
            median = sortedIntegers.get(size / 2);
        } else {
            median = (sortedIntegers.get(size / 2 - 1) + sortedIntegers.get(size / 2)) / 2.0;
        }
        return median;
    }

    public static void writeResultsToFile(AnalysisResults results, String outputFile) {
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(results.toString());
            System.out.println("Content written to file: " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}
