import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

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


    }
}
