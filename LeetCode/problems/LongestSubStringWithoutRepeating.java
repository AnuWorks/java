package LeetCode.problems;

import java.util.HashSet;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        // take hash set
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxSize = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxSize = Math.max(maxSize, right - left + 1);
        }
        return maxSize;
    }

}
