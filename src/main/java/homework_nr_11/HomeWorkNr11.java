package homework_nr_11;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class HomeWorkNr11 {
    public static void main(String[] args) {
        List<String> ListOfStrings = new ArrayList<>();
        ListOfStrings.add("Alex");
        ListOfStrings.add("Marry");
        ListOfStrings.add("Maxim");
        ListOfStrings.add("Valerii");
        ListOfStrings.add("Vasilii");
        ListOfStrings.add("Oleg");
        ListOfStrings.add("George");
        ListOfStrings.add("Jackson");
        ListOfStrings.add("Liza");
        ListOfStrings.add("Lily");

        System.out.println("---------List of strings less 5 chars and include A ----------");
        List<String> ListOfStringsLessFiveCharsAndIncludeA = ListOfStrings.stream()
                .map(e -> e.toLowerCase(Locale.ROOT))
                .filter(e -> e.contains("a"))
                .filter(e -> e.length() < 5)
                .collect(Collectors.toList());

        System.out.println(ListOfStringsLessFiveCharsAndIncludeA);
        List<Person> ListOfPersons = new ArrayList<>(Arrays.asList(
                new Person("Alex", "Vilov", 25, true),
                new Person("Marry", "Poll", 18, false),
                new Person("Maxim", "Evans", 35, true),
                new Person("Valerii", "Smith", 46, true),
                new Person("Vasilii", "Brown", 33, true),
                new Person("Oleg", "Davies", 38, true),
                new Person("George", "Taylor", 34, true),
                new Person("Jackson", "Cook", 56, true),
                new Person("Liza", "Turner", 22, false),
                new Person("Lily", "Smith", 45, false)
        ));
        System.out.println("------List of persons with age<30 and IsMale=False------- ");
        List<String> ListOfPersonAgeLess30AndIsMaleIsTrue = ListOfPersons.stream()
                .filter(e -> e.getAge() < 30)
                .filter(e -> !e.isMale())
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(ListOfPersonAgeLess30AndIsMaleIsTrue);

        System.out.println("------First person with age<30, IsMale=False and Surname contains P -----");

        Optional<Person> Employee = ListOfPersons.stream()
                .filter(e -> e.getAge() < 30)
                .filter(e -> !e.isMale())
                .filter(e->e.getSurname().contains("P"))
                .findFirst();
        System.out.println(Employee.orElse(new Person("Error", "Error", -1, false)));
    }
}