package homework_nr_15;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    int yearMade;
    String name;

    public Car(int yearMade, String name) {
        this.yearMade = yearMade;
        this.name = name;
    }

    @Override
    public int compareTo(Car o) {
        return Comparator.comparingInt((Car e) -> e.yearMade)
                .reversed()
                .compare(this, o);
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearMade=" + yearMade +
                ", name='" + name + '\'' +
                '}';
    }
}
