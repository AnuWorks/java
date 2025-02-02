import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class StreamWorks {

    record Car(String type, String make, String model, Integer engineCapacity){}

    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car("Sedan", "Toyota", "Camry", 2500),
                new Car("SUV", "Honda", "CR-V", 2000),
                new Car("Hatchback", "Ford", "Focus", 1600),
                new Car("Coupe", "BMW", "M4", 3000),
                new Car("Convertible", "Audi", "A5", 2200),
                new Car("Truck", "Chevrolet", "Silverado", 4300),
                new Car("SUV", "Tesla", "Model X", 0),
                new Car("Sedan", "Hyundai", "Elantra", 1800),
                new Car("Hatchback", "Volkswagen", "Golf", 1500),
                new Car("SUV", "Jeep", "Wrangler", 3600)
        );

        // Filter only sedans
        List<Car> sedan = cars.stream().filter( car -> car.type.equals("Sedan") ).toList();
        System.out.println(sedan);

        // Get all types of cars
        List<String> carMakeList = cars.stream().map(car -> car.make).toList();
        System.out.println(carMakeList);

        //Get Make and Model List
        // Audi, A5, Mercedes, E-Class...
        List<String> carMakeModelList = cars.stream().flatMap(car -> Stream.of(car.make,car.model)).toList();
        System.out.println(carMakeModelList);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
        Stream<Integer> filteredStream = integerStream.filter(n -> n % 2 == 0);
        System.out.println(filteredStream.toList());

        // Example
        // true, Sedan
        // false, Hatchback, SUV, etc..
        Map<Boolean, List<Car>> partitionedCars = cars.stream().collect(Collectors.partitioningBy( car -> car.type.equals("Coupe") ));
        System.out.println(partitionedCars);

        // (type, (make, engineCapacity))
        Map<String, Map<String, Integer>> groupedCars = cars.stream().collect(Collectors.groupingBy(
                car -> car.type,
                toMap(Car::make, Car::engineCapacity)
                )
        );
        System.out.println(groupedCars);



    }

}
