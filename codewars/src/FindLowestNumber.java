import java.util.stream.IntStream;

public class FindLowestNumber {
    public static void main(String[] args) {
        int[] array = {1,-6,9,66,-45,876};
        System.out.println(findSmallestInt(array));
    }

    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }

    // Or you can use below implementation
//    public static int findSmallestInt(int[] args) {
//        Arrays.sort(args);
//        return args[0];
//    }
}
