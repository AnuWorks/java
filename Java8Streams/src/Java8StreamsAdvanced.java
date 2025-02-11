import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamsAdvanced {
    public static void main(String[] args) {
        // How to use Streams ?

        // Source, intermediate operations, terminal operations
        // Source -> integers
        // intermediate operation -> filter
        // terminal operation -> count()

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(integers.stream().filter(num -> num % 2 == 0).count());

        // How to convert collections to stream
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> integerStream = list.stream();

        // From arrays
        String[] array = {"A", "B", "C"};
        Stream<String> stringStream = Arrays.stream(array);

        // From stream.of()
        Stream<Integer> anotherStream = Stream.of(1, 2, 3, 4);

        // infinite Stream (Here we have limited to 100 so it does not become infinite and eat up our resources
        Stream<Integer> infiniteStream = Stream.generate(() -> 1).limit(100);

        // Iterate
        List<Integer> oneToTen = Stream.iterate(1, x -> x + 1).limit(10).toList();
        System.out.println(oneToTen);


    }
}
