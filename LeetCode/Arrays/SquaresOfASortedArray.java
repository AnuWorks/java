package LeetCode.Arrays;

/*

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

 */

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SquaresOfASortedArray {
    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};
        int[] output = sortedSquares(nums);
        for (int num : output) {
            System.out.print(num);
        }

    }

    public static int[] sortedSquares(int[] nums) {

        return IntStream.of(nums).map(num -> num * num).sorted().toArray();


    }
}
