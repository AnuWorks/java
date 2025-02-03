public class DSALinearSearch {
    public static void main(String[] args) {

        // Linear Search - Iterate through collection one element at a time
        // Big O notation - O(n)

        int[] array = {9,4,5,67,3,1,87,56};

        int index = linearSearch(array, 1);
        if(index == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at: " + index);
        }


    }

    private static int linearSearch(int[] array, int num){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }
}
