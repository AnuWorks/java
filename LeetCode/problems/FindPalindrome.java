package LeetCode.problems;


// Find palindrome without converting to String
public class FindPalindrome {

    public static void main(String[] args) {

        System.out.println(findPalindrome(-121));
    }

    static boolean findPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        int temp = x;
        int reversed = 0;
        while (temp != 0) {
            int last = temp % 10;
            reversed = reversed * 10 + last;
            temp = temp / 10;
        }
        System.out.println(reversed);

        return reversed == x;

    }

}
