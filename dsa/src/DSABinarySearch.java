import java.util.Arrays;

public class DSABinarySearch {

    // Binary Search - Search for an element in sorted data structure
    // Big O notation - O(log n)

    public static void main(String[] args) {
        int[] array = new int[100];
        int target = 34;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        //int index = Arrays.binarySearch(array, target); // Instead of using pre-built Binary search let's build our own
        int index = binarySearch(array, target);
        if(index == -1){
            System.out.println("Target " + target + " not found");
        }else {
            System.out.println("Element found at: " + index);
        }
    }

    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int middle = low + (high - low) / 2;
            int value = array[middle];
            if(value < target){
                low = middle + 1;
            } else if (value > target) {
                high = middle -1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
