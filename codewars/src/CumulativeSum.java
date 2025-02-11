import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CumulativeSum {
    public static void main(String[] args) {
        List<Integer> intList = Stream.iterate(1, x -> x + 1).limit(5).toList();
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = intList.stream().map(x -> sum.addAndGet(x)).toList();
        System.out.println(cumulativeSum);
    }
}
