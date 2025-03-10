package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 4, 7);

        Set<Integer> collect = integers.stream().collect(Collectors.toSet());
        System.out.println(collect);

        List<String> cities = Arrays.asList("Melbourne", "Sydney", "Adelaide");
        List<String> filteredCities = cities.stream().filter(city -> city.startsWith("M")).toList();
        System.out.println(filteredCities);

        //Joining Strings
        String cityNames = cities.stream().collect(Collectors.joining("|"));
        System.out.println(cityNames);

        // Statistics
        IntSummaryStatistics stats = integers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(stats.getAverage());
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());

        // Group strings
        List<String> wordings = Arrays.asList("Hello", "Worlds", "my", "name", "is", "Anudeep", "Madrampalli");
        System.out.println(wordings.stream().collect(Collectors.groupingBy(word -> word.length())));
        System.out.println(wordings.stream().collect(Collectors.groupingBy(word -> word.length(), Collectors.joining("|"))));
        System.out.println(wordings.stream().collect(Collectors.groupingBy(word -> word.length(), Collectors.groupingBy(word -> word.startsWith("A")))));
        System.out.println(wordings.stream().collect(Collectors.groupingBy(word -> word.length(), Collectors.counting())));
        HashMap<Integer, Long> collectorDemo = wordings.stream().collect(Collectors.groupingBy(String::length, HashMap::new, Collectors.counting()));
        System.out.println(collectorDemo);

        // Partition
        System.out.println("-----");
        System.out.println(wordings.stream().collect(Collectors.groupingBy(x -> x.length() > 5)));
        System.out.println(wordings.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // Collecting and Mapping
        System.out.println(wordings.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

        // Example 1 :  Collect Names by length
        List<String> names = Arrays.asList("Alice", "James", "Bob", "Nadugo", "Emil", "Rodriguez");
        System.out.println(names.stream().collect(Collectors.groupingBy(x -> x.length())));

        // Example 2: Counting word occurrence
        String occur = "hello world hello world java world";
        System.out.println(Arrays.stream(occur.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Example 3: partition Even and odd Numbers
        List<Integer> integerList = Stream.iterate(1, x -> x + 1).limit(100).toList();
        System.out.println(integerList.stream().collect(Collectors.groupingBy(x -> x % 2 == 0)));

        //Example 4: Summing values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);

        System.out.println(items.values().stream().reduce((x, y) -> x + y).get());
        // Or
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // Example 5 : Creating a Map from stream elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

        // Example 6:
        List<String> fruits2 = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Banana");
        System.out.println(fruits2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> (x + y))));


    }
}
