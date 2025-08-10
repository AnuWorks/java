package forge.cognify;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        String a = "Anudeep";
        String b = new String("Anudeep");

        System.out.println(b.equals(a));
        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("B"));
        stack.pop();
        System.out.println(stack);

        // Queue
        System.out.println("----Queue----");
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.offer("B");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue);

        // Reverse a String
        System.out.println(reverseAString("Anudeep"));
        //Palindrome
        String palin = "racecar";
        System.out.println(STR."is \{palin} Palindrome:\{palin.equals(reverseAString(palin))}");
        //non repeating char
        String nonRepeating = "AABBCDDYY";
        System.out.println("Non Repeating char::"+ nonRepeatingChar(nonRepeating));

        // find missing number in array
        int[] myArray = {1,2,3,5,6};
        System.out.println(findMissingArray(myArray, 6));

        // find longest substring
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

        // Binary search
        int[] myArr = new int[100];
        int target = 34;
        for (int i = 0; i < 100; i++) {
            myArr[i] = i+1;
        }
        System.out.println("Binary Search::" + binarySearch(myArr, target));

    }

    public static int binarySearch(int[] inp, int target){
        int low=0;
        int high = inp.length-1;
        while (low <= high){
            int middle = low + (high - low) / 2;
            int value = inp[middle];
            if(value < target){
                 low = middle + 1;
            }else if (value > target){
                high = middle-1;
            }else {
                return middle;
            }
        }
        return -1;

    }

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> window = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < s.length()){
            if(!window.contains(s.charAt(right))){
                window.add(s.charAt(right));
                maxLen = Math.max(maxLen, right-left + 1);
                right++;
            }else {
                window.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(window);
        return maxLen;
    }



    public static int findMissingArray(int[] inp, int total){
        int totalSum = (total * (total + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < inp.length; i++) {
            actualSum+=inp[i];
        }
        return totalSum-actualSum;
    }

    public static char nonRepeatingChar(String inp){
        Map<Character, Integer> charMap = new HashMap<>();
        char[] charArray = inp.toCharArray();
        for (char c : charArray) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(charMap);
        char output = ' ';
        for(Character key: charMap.keySet()){
            if(charMap.get(key) == 1){
                output =  key;
            }
        }
        return output;
    }

    public static String reverseAString(String inp){
        StringBuilder sb = new StringBuilder();
        char[] charArray = inp.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        return sb.toString();
    }


}
