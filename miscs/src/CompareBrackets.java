import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CompareBrackets {
    public static void main(String[] args) {
        System.out.println(isValid("(([]))"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            System.out.println(c);
            if (mapping.containsValue(c)) {
                stack.push(c);
            } else if (mapping.containsKey(c)) {
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                    return false;
                }
            }
            System.out.println(stack);
        }

        return stack.isEmpty();
    }
}
