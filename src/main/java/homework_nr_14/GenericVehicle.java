package homework_nr_14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericVehicle <T extends Vehicle > implements Serializable{
    String name;
    List<T > list = new ArrayList<>();

    public GenericVehicle(String name) {
        this.name = name;
    }

    public void addVehicle(T Vehicle){
        list.add(Vehicle);
    }
}
