package codeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Outlier {
    public static void main(String[] args) {
        int[] integers = {2, 4, 0, 100, 4, 11, 2602, 36};
        //int[] integers = {160, 3, 1719, 19, 11, 13, -21};
        System.out.println(find(integers));
    }

    static int find(int[] integers) {

        return Arrays.stream(integers)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .values()
                .stream()
                .filter(list -> list.size() == 1)
                .map(list -> list.get(0))
                .findFirst().get();


    }
}
