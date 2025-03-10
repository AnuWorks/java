package dsa;

public class DSASelectionSort {

    // Big O notation - O(n^2)
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 4, 3, 6};

        selectionSort(array);

        for (int i : array) {
            System.out.print(i);
        }


    }

    // In selection sort we compare the first element with other elements until we find minimum value
    // Once found, Not the index of min value
    // Once the second for loop exits an iteration, swap the first element compared with the min value
    // To swap we need a temp
    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            // to note the index of the min value
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                // This is in ascending order
                // If we need descending order, change > to < in below if condition
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            // Swap the elements
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }


}