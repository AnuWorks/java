package LeetCode.problems;

import java.util.HashSet;

public class FindLongestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        // take hash set
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxSize = 0;

        // Sliding window
        for (int right = 0; right < s.length(); right++) {
            System.out.println("char right->" + s.charAt(right));
            // if set contains characters, remove them un-till all duplicates are removed
            while (set.contains(s.charAt(right))) {
                System.out.println("set in while->" + set);
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            System.out.println("set add->" + set);
            maxSize = Math.max(maxSize, right - left + 1);
            System.out.println("maxSize->" + maxSize);
        }
        return maxSize;
    }
}
