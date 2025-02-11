import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Java8StreamsBasics {


    public static void main(String[] args) {
        // Lambda - Any abstract method can be converted to lambda
        // lambda is anonymous function - No access modifier, no return type, no name
        // Runnable interface have only one method, which is void run();
        // Instead of implementing class and invoking here, Just use Lambda and provide the definition for run()
        Thread t1 = new Thread(() -> System.out.println("T1"));

        // Predicate -  it is an functional interface (Boolean valued function)
        // Using predicate, we can store the conditional statement in variable

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
        Consumer<String> consumerTest = x -> System.out.println(x);
        consumerTest.accept("consumer printing this text!!");
        List<Integer> intList = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> consumeList = listOfIntegers -> {
            for (int num : listOfIntegers) {
                System.out.print(num);
            }
        };
        System.out.println("Consumer accepting List of integers:");
        consumeList.accept(intList);


        // Supplier
        Supplier<String> supplierTest = () -> "Hello world !!";
        System.out.println("Supplier: " + supplierTest.get());

        // Combined example
        System.out.println("---Combined example---");

        Predicate<Integer> predicate = n -> n % 2 == 0;
        Function<Integer, Integer> function = n -> 2 * n;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

        // BiConsumer, BiFunction, BiPredicate
        // There is no BiSupplier as we can return only one

        BiPredicate<Integer, Integer> biPredicate = (x, y) -> (x + y) % 2 == 0;
        System.out.println(biPredicate.test(2, 6));

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + " " + y);
        biConsumer.accept(11, 22);

        // BiFunction take 3 parameters, 2 input and 1 return type
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("ABC", "DEF"));


        // Unary and Binary Operator
        // Consider Function<Integer, Integer> doubleIt = x -> 2 * x;
        // In this function both accepting and returning parameters are same, So Java introduced UnaryOperator which extend Function
        // So above function can be written as
        UnaryOperator<Integer> unaryOperator = x -> 2 * x;
        System.out.println(unaryOperator.apply(10));

        // BinaryOperator
        // BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        // Above BiFunction we are passing 2 strings and getting 1 integer as return type
        // Consider a scenario where we have input parameters and output parameter are of same type
        // In that case we can use BinaryOperator
        BinaryOperator<String> binaryOperator = (x, y) -> x + y;
        System.out.println(binaryOperator.apply("Melbourne ", "CBD"));

        // Method Reference
        List<String> cities = Arrays.asList("Melbourne", "Sydney", "Adelaide");
        // forEach take consumer as parameter
        //cities.forEach(city -> System.out.println(city)); -> This can be written as below
        cities.forEach(System.out::println);

        // Constructor Reference
        List<String> names = Arrays.asList("Nokia", "Apple", "Google");
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).toList();
        for (MobilePhone phoneName : mobilePhoneList) {
            System.out.println(phoneName.name);
        }


    }

}

class MobilePhone {
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}
