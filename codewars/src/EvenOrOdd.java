public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(3));
    }

    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
