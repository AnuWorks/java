import java.util.Stack;

public class DSAStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Witcher");
        stack.push("Zelda");

        System.out.println(stack.empty()); // Check if the stack is empty
        System.out.println(stack);

        String myFavGame = stack.pop();
        System.out.println("Fav game: " + myFavGame);

        System.out.println(stack); // pop() removed the top most element

        System.out.println(stack.peek()); //Since pop() remove top element, instead use peek()
        System.out.println(stack);

        System.out.println(stack.search("Zelda")); // search() give -1 as we pop()'ed Zelda above [pop() remove top element]
        System.out.println(stack.search("Minecraft"));
        System.out.println(stack.search("Skyrim"));
        System.out.println(stack.search("Witcher"));

        // Just to check if we have same element in stack if we search, what happens

        stack.push("Doom");
        stack.push("Doom");
        System.out.println(stack);
        System.out.println(stack.search("Doom")); // search() returns first found element, so we can have duplicates in stacks
    }
}
