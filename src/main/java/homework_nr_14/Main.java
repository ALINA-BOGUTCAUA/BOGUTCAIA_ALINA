package homework_nr_14;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Airplane Airplane1 = new Airplane("Alenia", "737");
        Airplane Airplane2 = new Airplane("Boeing", "700");
        GenericVehicle<Airplane > listOfAirplanes = new GenericVehicle<>("List Of Airplanes");
        listOfAirplanes.addVehicle(Airplane1);
        listOfAirplanes.addVehicle(Airplane2);
        Car car1 = new Car("BMV");
      //  listOfAirplanes.addVehicle(car1); don't work

    }
}
