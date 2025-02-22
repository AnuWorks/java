package LeetCode.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, output = 0;
        for (int num : nums) {
            if (num == 0) {
                output = Math.max(output, sum);
                sum = 0;
            } else {
                sum++;
            }
        }
        return Math.max(output, sum);
    }
}
