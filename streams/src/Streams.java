import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 3, 8, 9, 4);

        Predicate<Integer> oddNum = num -> num % 2 != 0;

        int sum = list.parallelStream()
                .filter(oddNum)
                .map(num -> num * 2)
                .reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
