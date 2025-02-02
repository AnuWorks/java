public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(-45));
    }

    public static int makeNegative(final int x) {

        return x < 0 ? x : -x;

    }
}
