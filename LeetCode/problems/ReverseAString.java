package LeetCode.problems;

public class ReverseAString {

    public static void main(String[] args) {
        String input = "This is a String";
        System.out.println(reverseString(input));
    }

    public static String reverseString(String input) {

        // we need a String builder so we can copy the string characters in reverse
        StringBuilder output = new StringBuilder();
        // Need an iterator to iterate original string
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }

        return output.toString();
    }
}
