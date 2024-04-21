package homework_nr10;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        System.out.println("----Realization of functional interface Predicate---");
        List<Integer> listOfNumbers = List.of(10, 5, 14, 12, 3);
        Predicate<Integer> oddNumbers  = (Integer e) ->{
            return e % 2 == 1 ;
        };

        printOddNumbers(listOfNumbers, oddNumbers);

        System.out.println("----Realization of functional interface Consumer---");

        String string = "This string will be passed to Consumer!";

        Consumer<String> printString = System.out::println;
        printString.accept(string);

        System.out.println("----Realization of functional interface Function---");

        Integer number = 1000;
        Function<Integer, Integer> multiplyByTwo = (Integer e) ->{
            return e*2;
        };

        printMultiplication(number, multiplyByTwo);

        System.out.println("----Realization of functional interface Supplier---");

        Supplier<Integer> randomize = () ->{
            Random rand = new Random();
            return rand.nextInt(101);
        };
        System.out.println("Random number: " + randomize.get());
        System.out.println("____________________________________");

        System.out.println("------Employee------");

        Employee employee1 = new Employee("Oleg", "Baranov", 40, "Software Engineering");
        Employee employee2 = new Employee("Alena", "Solovieva", 19, "Cybersecurity");
        Employee employee3 = new Employee("Anton", "Varenic", 18, "Software Engineering");
        Employee employee4 = new Employee("Vasilii", "Matveev", 35, "Data storage");
        List<Employee> AllEmployee = List.of(employee1, employee2, employee3, employee4);

        System.out.println("-----Employee in  Software Engineering department:");

        Predicate<Employee> departmentSoftwareEngineering = (Employee e) ->{
            return e.department.contains("Software Engineering");
        };

        testEmployee(AllEmployee, departmentSoftwareEngineering);

        System.out.println("-----Employee over 20 years old: ");

        Predicate<Employee> Over20YearsOld = (Employee e) ->{
            return e.age >20 ;
        };
        testEmployee(AllEmployee, Over20YearsOld);

        System.out.println("------Employee with name starts with A:");

        Predicate<Employee> NameStartsWithA = (Employee e) -> e.name.startsWith("A");

        testEmployee(AllEmployee, NameStartsWithA);
    }

    public static void printOddNumbers (List<Integer> InputList, Predicate<Integer> algo){
        System.out.println("All odd numbers:");
        for (int index = 0; index != InputList.size(); index++){
            if (algo.test(InputList.get(index))){
                System.out.println(InputList.get(index));
            }
        }
    }

    public static void printMultiplication(Integer number, Function<Integer, Integer> algo){
        System.out.println(number + " multiply by 2: " + algo.apply(number));
    }

    public static void testEmployee (List<Employee> list , Predicate<Employee> testMethod){
        for (int index = 0; index != list.size(); index++ ){
            if (testMethod.test(list.get(index))){
                System.out.println(list.get(index).name + " " + list.get(index).surname + " " + list.get(index).age + " " + list.get(index).department );
            }
        }
    }


}
