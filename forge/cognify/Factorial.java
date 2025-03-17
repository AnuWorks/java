package forge.cognify;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i < n + 1; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
