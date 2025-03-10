package dsa;

public class DSAInterpolationSearch {

    // Interpolation Search is improvement over Binary Search on uniformly distributed data
    // "Guess" where data might be based on calculated probe results
    // If probe is incorrect, search are is narrowed and a new probe is calculated

    // Average cae: O(log(log (n)))
    // Worst case: O(n) [Values increase exponentially]

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int index = interpolationSearch(array, 70);
        if(index != -1){
            System.out.println("Element found at :"+ index);
        }else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low = 0;

        while (low <= high && value >= array[low] && value <= array[high]) {

            int probe = low + ( ( (value - array[low]) * (high - low) ) / (array[high] - array[low]));

            System.out.println("Probe: "+ probe);
            if (array[probe] == value){
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            }else {
                high = probe - 1;
            }
        }

        return -1;
    }

}
