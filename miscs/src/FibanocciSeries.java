public class FibanocciSeries {


    // Given an integer n, find fibanocci series till n
    public static void main(String[] args) {
        int[] fibanocciSeries = findFibanocci(10);
        for (int num : fibanocciSeries) {
            System.out.print(num + "\t");
        }
    }

    // Fibanocci series - number is sum of preceding numbers
    public static int[] findFibanocci(int n) {

        if (n <= 0) {
            return new int[0];
        }
        // Have one array to capture the series and return
        int[] result = new int[n];

        result[0] = 0;

        result[1] = 1;

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        // return result
        return result;
    }
}
