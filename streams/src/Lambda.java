import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        
        // User List.of() and add the list of elements
        List<String> names = List.of("Anudeep", "Priya", "Akshara", "Ayansh", "Sandeep");

        // user streams().filter() and print names
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

    }
}