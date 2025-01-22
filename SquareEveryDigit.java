/*Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.*/

public static void main(String[] args) {
    System.out.println(squareDigits(765));
}

public static int squareDigits(int n) {

    char[] nums = String.valueOf(n).toCharArray();
    String output = "";
    for(char num : nums){
        output =  output.concat(  Integer.toString( Character.getNumericValue(num) * Character.getNumericValue(num) ));
    }

    return Integer.parseInt(output);
}
