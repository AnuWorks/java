package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {

    public static void main(String[] args) {

        // Filter
        List<String> cities = Arrays.asList("Melbourne", "Sydney", "Adelaide", "Melbourne");
        Long count = cities.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(count);

        // map
        Stream<String> stringStream = cities.stream().map(String::toUpperCase);

        // Sorted
        Stream<String> sortedStream = cities.stream().sorted();
        Stream<String> sortedUsingComparitorStream = cities.stream().sorted((a, b) -> a.length() - b.length());

        // Distinct
        System.out.println(cities.stream().distinct().count());

        // limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());


        // Skip
        List<Integer> skipTest = Stream.iterate(1, x -> x + 1).skip(10).limit(100).toList();
        System.out.println(skipTest);

        // Flatmap
        // Handles list of lists, Handles and transforms
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Apple", "Orange"),
                Arrays.asList("Peach", "Strawberry"),
                Arrays.asList("Mango", "Banana")
        );

        List<String> fruits = listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList();
        System.out.println(fruits);

        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java is useful",
                "Flatmap is to handle and transform"
        );
        List<String> words = sentences
                .stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(word -> word.toUpperCase())
                .toList();
        System.out.println(words);

    }
}
