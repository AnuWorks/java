package streams;

import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        
        List<String> names = List.of("Anudeep", "Priya", "Akshara", "Ayansh", "Sandeep");

        // Streams
        // Filter
        names.stream()
            .filter( name -> name.startsWith("A"))
            .toList()
            .forEach(System.out::println);
        // Reduce
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        int sumOfNumber = numbers.stream().reduce(0, (subtotal ,element) -> subtotal + element);
        System.out.println("Sum of numbers: " + sumOfNumber);

        // Map
        List<Integer> evenNumbers = numbers.stream()
            .filter(number -> number % 2 == 0).toList();
        System.out.println("Even numbers: " + evenNumbers);


    }
}
