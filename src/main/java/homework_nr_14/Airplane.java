package homework_nr_14;

import java.io.Serializable;

public class Airplane extends Vehicle implements Serializable {
    String name;
    String model;

    public Airplane(String name, String model) {
        this.name = name;
        this.model = model;
    }
}
