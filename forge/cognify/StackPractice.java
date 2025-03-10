package forge.cognify;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Melbourne");
        stack.push("Sydney");
        stack.push("Adelaide");
        stack.push("Perth");
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

        stack.addFirst("Canberra");
        System.out.println(stack.peek());

        stack.addLast("ACT");
        System.out.println(stack.peek());

        System.out.println(stack.search("Canberra"));
        System.out.println(stack.search("Melbourne"));
        System.out.println(stack.search("Perth"));
        System.out.println(stack.peek());


    }
}
