package LeetCode.problems;

public class FindMissingNumberInAnArray {

    public static void main(String[] args) {
        System.out.println(findMissingNumberInAnArray(new int[]{1, 2, 3, 4, 6}, 6));
        System.out.println(findMissingNumberInAnArrayBestApproach(new int[]{1, 2, 3, 4, 6}, 6));
    }


    // Brute force
    public static int findMissingNumberInAnArray(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            if (j + 1 != array[i]) {
                return j + 1;
            }
        }
        return array[array.length - 1];
    }

    // Best approach using formula
    private static int findMissingNumberInAnArrayBestApproach(int[] array, int n) {
        // formula Expected sum = N * (n+1) / 2
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }
        return expectedSum - actualSum;

    }

}
