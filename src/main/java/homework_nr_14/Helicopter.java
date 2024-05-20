package homework_nr_14;

import java.io.Serializable;

public class Helicopter extends Vehicle implements Serializable {
    String model;
    int nrOfEngines;

    public Helicopter(String model, int nrOfEngines) {
        this.model = model;
        this.nrOfEngines = nrOfEngines;
    }
}
