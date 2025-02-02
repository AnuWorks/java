/*Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
Return the resulting string.
Note: input will never be an empty string*/

// String functions

public static void main(String[] args) {
    System.out.println(fakeBin("45385593107843568"));
}

public static String fakeBin(String numberString) {
    char[] input = numberString.toCharArray();
    for (int i = 0; i < input.length; i++) {
        if (Character.getNumericValue(input[i]) < 5) {
            input[i] = '0';
        } else {
            input[i] = '1';
        }
    }

    return String.valueOf(input);
    // Simple solution
    //return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");

}
