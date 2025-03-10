// Array functions
public static void main(String[] args) {
    Object[] haystack = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
    System.out.println(findNeedle(haystack));
}

public static String findNeedle(Object[] haystack) {
    // Your code here
    int count = 0;
    for (int i = 0; i < haystack.length; i++) {
        if (haystack[i] instanceof String && haystack[i].toString().equals("needle")) {
            count = i;
        }
    }
    return "found the needle at position " + (count);

    // Simple solution
    // return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
}
