package LeetCode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInts("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        Map<String, Integer> romans = new HashMap<>();
        // Normal romans
        romans.put("I", 1);
        romans.put("V", 5);
        romans.put("X", 10);
        romans.put("L", 50);
        romans.put("C", 100);
        romans.put("D", 500);
        romans.put("M", 1000);
        // Romans with subtraction (reversed)
        romans.put("VI", 4);
        romans.put("XI", 9);
        romans.put("LX", 40);
        romans.put("CX", 90);
        romans.put("DC", 400);
        romans.put("MC", 900);

        // convert to char array reversed
        String[] romanNumerals = new StringBuilder(s).reverse().toString().split("");

        int sum = 0;
        // iterate
        for (int i = 0; i < romanNumerals.length; i++) {

            if (i < romanNumerals.length - 1 && romans.get(romanNumerals[i] + romanNumerals[i + 1]) != null) {
                sum = sum + romans.get(romanNumerals[i] + romanNumerals[i + 1]);
                i++;
            } else {
                sum = sum + romans.get(romanNumerals[i]);
            }
        }

        return sum;

    }

    // From leet code simple solutions

    public static int romanToInts(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
            System.out.println(res);
        }

        return res + roman.get(s.charAt(s.length() - 1));
    }
}
