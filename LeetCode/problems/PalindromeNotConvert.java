package LeetCode.problems;

public class PalindromeNotConvert {

    public static void main(String[] args) {
        System.out.println(withString(-1221));
        System.out.println(asNumber(146841));
    }

    public static boolean withString(int num) {

        return new StringBuilder(String.valueOf(num)).reverse().toString().equals(String.valueOf(num));

    }

    public static boolean asNumber(int num) {
        boolean result = false;

        int reversed = 0;
        int temp = num;


        while (num > 0 && temp != 0) {
            int lastNum = temp % 10;
            reversed = reversed * 10 + lastNum;
            temp = temp / 10;
        }
        result = reversed == num;

        return result;
    }

}
