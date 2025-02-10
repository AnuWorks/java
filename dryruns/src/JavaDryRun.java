import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class JavaDryRun {


    public static void main(String[] args) {
        // Lambda - Any abstract method can be converted to lambda
        // lambda is anonymous function - No access modifier, no return type, no name
        // Runnable interface have only one method, which is void run();
        // Instead of implementing class and invoking here, Just use Lambda and provide the definition for run()
        Thread t1 = new Thread(() -> System.out.println("T1"));

        // Predicate -  it is an functional interface (Boolean valued function)

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(4));
        Predicate<String> doesStartWithA = str -> str.startsWith("A");
        Predicate<String> doesEndWithP = str -> str.endsWith("P");
        Predicate<String> and = doesStartWithA.and(doesEndWithP);
        System.out.println("And ->" + and.test("AnudeeP"));

        // Function -> Works for you, Take something and give something
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.apply(10));
        System.out.println(tripleIt.apply(100));
        System.out.println(doubleIt.andThen(tripleIt).apply(10));  // 10 * 2 = 20, and then 20 * 3 = 60
        // When we use compose, First tripleIt will apply and then doubleIt
        System.out.println(doubleIt.compose(tripleIt).apply(10));
        // identity
        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(5));

        // Consumer -> functional interface
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("consume this");
        List<Integer> intList = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> consumeList = listOfIntegers -> {
            for (int num : listOfIntegers) {
                System.out.println(num);
            }
        };
        consumeList.accept(intList);


    }

}
