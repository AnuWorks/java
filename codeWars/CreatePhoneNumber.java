package codeWars;

import java.util.stream.IntStream;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(createPhoneNumber(numbers));
        System.out.println(betterPhoneFormat(numbers));
        System.out.println(useStream(numbers));

    }

    // using Stream
    private static String useStream(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
        //return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }

    // My own
    public static String createPhoneNumber(int[] numbers) {

        StringBuilder phone = new StringBuilder();

        phone.append('(');
        for (int i = 0; i < numbers.length; i++) {
            if (i < 3) phone.append(numbers[i]);
            if (i == 3) phone.append(") ").append(numbers[i]);
            if (i > 3 && i < 6) phone.append(numbers[i]);
            if (i == 6) phone.append('-').append(numbers[i]);
            if (i > 6) phone.append(numbers[i]);
        }

        return phone.toString();
    }

    private static String betterPhoneFormat(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1], numbers[2],
                numbers[3], numbers[4], numbers[5],
                numbers[6], numbers[7], numbers[8], numbers[9]);
    }
}
