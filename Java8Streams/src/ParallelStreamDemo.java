import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<Integer> integerList = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        long startTime = System.currentTimeMillis();
        List<Integer> factorialList = integerList.stream().map(ParallelStreamDemo::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken:" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        List<Integer> factorialParallelList = integerList.parallelStream().map(ParallelStreamDemo::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken:" + (endTime - startTime) + "ms");

        // Cumulative Sum
        // [1,2,3,4,5] -> [1,3,6,10,15]
        // We cannot use the parallel stream here as parallel stream will not process data sequentially.
        List<Integer> intList = Stream.iterate(1, x -> x + 1).limit(5).toList();
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = intList.stream().map(x -> sum.addAndGet(x)).toList();
        System.out.println(cumulativeSum);

    }

    private static int factorial(int input) {
        int result = 1;

        for (int i = input; i > 0; i--) {
            result = result * i;
        }

        return result;

    }
}
