package forge.cognify;

import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        decimalToBinary(45);
        // palindrome(121);
    }

    public static void decimalToBinary(int n) {

        Stack<Integer> binary = new Stack<>();
        int temp = n;
        while (temp > 0) {
            binary.push(temp % 2);
            temp = temp / 2;
        }
        System.out.println(binary);
        for (int val : binary) {
            System.out.print(val);
        }
        System.out.println();

    }

    public static void palindrome(int n) {
        int temp = n;
        int palind = 0;
        while (temp != 0) {
            int lastNum = temp % 10;
            palind = palind * 10 + lastNum;
            temp = temp / 10;
        }
        System.out.println(palind);
        System.out.println(n == palind);
    }
}
