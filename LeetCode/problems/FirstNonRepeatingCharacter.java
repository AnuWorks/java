package LeetCode.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingCharacter("AABBCXXYYZZU"));
    }


    public static Character findFirstNonRepeatingCharacter(String input) {
        Map<Character, Integer> charMap = new HashMap<>();
        // put all characters and count in the map
        for (int i = 0; i < input.length(); i++) {
            charMap.put(input.charAt(i), charMap.getOrDefault(input.charAt(i), 0) + 1);
        }

        // Check which character have count 1, return
        for (Character key : charMap.keySet()) {
            System.out.println(key + "-" + charMap.get(key));
            if (charMap.get(key) == 1) {
                return key;
            }
        }

        return null;

    }
}
