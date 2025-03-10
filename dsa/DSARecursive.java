package dsa;

public class DSARecursive {

    // A function which call itself
    // A larger problem is broken down into smaller problem
    public static void main(String[] args) {
        // Example 1
        steps(10);

        // Example 2
        int factorialOfNumber = factorial(7);
        System.out.println(factorialOfNumber);

        // Example 3
        int power = power(2, 8);
        System.out.println(power);
    }

    private static void steps(int n) {

        if (n < 0) { // base case - where recursion stops
            return;
        }
        System.out.println("Take a step: " + n);
        steps(n - 1); // Recursion case

    }

    private static int factorial(int i) {
        if (i < 1) return 1; // Base case
        return i * factorial(i - 1); // Recursive
    }

    private static int power(int base, int exponent) {

        if (exponent < 1) return 1; // Base case
        return base * power(base, exponent - 1);

    }


}
