import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        // Given a List of numbers, use stream to filter, map, and collect results.

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> processedNumbers = numbers.stream()
                                                .filter(num -> num % 2 == 0)
                                                .collect(Collectors.toList());

        System.out.println(processedNumbers);
    }
}
