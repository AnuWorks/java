import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> integerList = Stream.iterate(1, x -> x + 1).limit(5).toList();

        // Collect
        List<Integer> skippedList = integerList.stream().skip(1).toList();

        // forEach
        integerList.stream().forEach(System.out::println);

        // reduce
        Optional<Integer> sumList = integerList.stream().reduce((x, y) -> x + y);
        System.out.println(sumList.get());

        // Count

        //anyMatch, allMatch, noneMatch
        boolean anyMatch = integerList.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyMatch);

        boolean allMatch = integerList.stream().allMatch(x -> x > 0);
        System.out.println(allMatch);

        boolean noneMatch = integerList.stream().noneMatch(x -> x < 0);
        System.out.println(noneMatch);

        // Find
        System.out.println(integerList.stream().findFirst().get());
        System.out.println(integerList.stream().findAny().get());

        // Filter Names and collect
        List<String> cities = Arrays.asList("Melbourne", "Sydney", "Adelaide", "Perth");
        System.out.println(cities.stream().filter(city -> city.length() > 5).toList());

        // Square the number and sort them
        System.out.println(integerList.stream().map(x -> x * x).sorted(Collections.reverseOrder()).toList());

        // summing values
        System.out.println(integerList.stream().reduce((x, y) -> x + y).get());

        // Counting occurrence
        // String.chars() provide intStream (Ascii value of each string)
        String test = "Hello World!!";
        System.out.println(test.chars().filter(x -> x == 'l').count());


    }
}
