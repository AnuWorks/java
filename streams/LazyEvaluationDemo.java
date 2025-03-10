package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Stream<String> stream = names.stream().filter(name -> {
            System.out.println("filtering: " + name);
            return name.length() > 3;
        });

        System.out.println("Before terminal operation");

        List<String> result = stream.toList();

        System.out.println("After terminal operation");
        System.out.println(result);


    }
}
