package LeetCode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int tatget = 6;
        int[] output = twoSum(nums, tatget);
        for (int num : output) {
            System.out.print(num);
        }
        int[] outputs = twoSums(nums, tatget);
        for (int num : outputs) {
            System.out.print(num);
        }
    }

    // Below is a brute force - Big O - O (n^2)
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};

                }
            }

        }
        return new int[2]; // no solution found
    }

    // Better way
    /*
    Suppose we have an array nums = [2, 7, 11, 15] and a target of target = 9. We want to find two numbers in nums that add up to target.

Initially, the unordered_map mp is empty. We start iterating through the array from left to right.

For the first element nums[0] = 2, we check if its complement target - nums[0] = 7 exists in the map by using the find() method. Since it does not exist in the map, we add the key-value pair (2, 0) to the map. The map now looks like this: {2: 0}.

For the second element nums[1] = 7, we check if its complement target - nums[1] = 2 exists in the map. Since it does exist in the map, we return the indices mp[2] = 0 and i = 1 as a vector {0, 1}.

Therefore, the code returns the expected output of [0, 1], indicating that the indices of the two elements that add up to the target are 0 and 1.


     */
    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[]{numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }
}
