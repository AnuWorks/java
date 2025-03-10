/*Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because */


public static void main(String[] args) {
    System.out.println(squareSum(new int[] {1,2,2}));
}

public static int squareSum(int[] n) {

    return Arrays.stream(n).map(num -> num * num).sum();
}
