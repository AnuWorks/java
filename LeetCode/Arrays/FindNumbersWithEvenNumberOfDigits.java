package LeetCode.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            String check = String.valueOf(num);
            if (check.length() % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}

