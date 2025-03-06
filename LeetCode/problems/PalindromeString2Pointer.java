package LeetCode.problems;

public class PalindromeString2Pointer {

    public static void main(String[] args) {
        System.out.println(palindromeWith2Pointer("ABDBA"));
    }

    public static boolean palindromeWith2Pointer(String input) {

        // iterate the string from 2 sides
        int middle = input.length() / 2;
        System.out.println("M->" + middle);
        int start = 0;
        int last = input.length() - 1;
        while (middle > 0) {
            System.out.println(input.charAt(start) + "-" + input.charAt(last));
            if (input.charAt(start) == input.charAt(last)) {
                start++;
                last--;
                middle--;
            } else {
                return false;
            }
            System.out.println("S->" + start + " L->" + last + " M->" + middle);
        }

        return true;
    }
}
