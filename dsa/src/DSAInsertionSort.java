public class DSAInsertionSort {

    // Big o notation - O(n^2)
    public static void main(String[] args) {
        int[] array = {9, 1, 4, 3, 8, 7, 2};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            // So tracks what element we are comparing to the left
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

    }
}
