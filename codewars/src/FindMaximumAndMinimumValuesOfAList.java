import java.util.Arrays;

public class FindMaximumAndMinimumValuesOfAList {
    public static void main(String[] args) {

        int[] minInput = new int[]{-52, 56, 30, 29, -54, 0, -110};
        int[] maxInput = new int[]{4,6,2,1,9,63,-134,566};

        System.out.println(min(minInput));
        System.out.println(max(maxInput));

    }

    public static int min(int[] list) {

        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

}
