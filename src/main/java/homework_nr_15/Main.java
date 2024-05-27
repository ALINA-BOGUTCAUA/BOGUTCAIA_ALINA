package homework_nr_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1992, "BMV");
        Car car2 = new Car(2005, "Audi");
        Car car3 = new Car(2000, "Ford");
        Car car4 = new Car(2010, "Kia");
        List<Car>  ListOfCars= new ArrayList<>(Arrays.asList(car1, car2, car3, car4));
        System.out.println("-------List of cars-----");
        ListOfCars.forEach(System.out::println);
        System.out.println("-------List sorted by years-------");
        ListOfCars.stream()
                .sorted(Car::compareTo)
                .forEach(System.out::println);
        System.out.println("------List sorted by name and year-----");
        ListOfCars.stream()
                .sorted((o1, o2) ->
                {
                    return Comparator.comparing((Car e)-> e.name)
                            .thenComparing((Car e)-> e.yearMade)
                            .compare(o1, o2);
                })
                .forEach(System.out::println);
    }
}
