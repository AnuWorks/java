package dsa;

public class DSAMergeSort {

    // Big O - O(n log n)
    public static void main(String[] args) {

        int[] array = {3, 7, 8, 5, 4, 2, 6, 1};

        mergeSort(array);

        for (int j : array) {
            System.out.print(j);
        }

    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return; // Base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int leftArrayIndex = 0; // left array
        int rightArrayIndex = 0; // right array

        for (; leftArrayIndex < length; leftArrayIndex++) {
            if (leftArrayIndex < middle) {
                leftArray[leftArrayIndex] = array[leftArrayIndex];
            } else {
                rightArray[rightArrayIndex] = array[leftArrayIndex];
                rightArrayIndex++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);


    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0;

        // Compare left array to right array, and store the element in main array
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // If element left in left array
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        // If element left in right array
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
        
    }

}
