package homework_nr_13;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", "A-321", 4);
        Airplane airplane2 = new Airplane("", null, 0);
        System.out.println(airplane1.getManufacturer() +  " " + airplane1.getModel() +  " " +  airplane1.getNrOfEngines());
        System.out.println(airplane2.getManufacturer() +  " " + airplane2.getModel() +  " " +  airplane2.getNrOfEngines());
        createAirplaneLBYL("Boeing", "k-132", 3);
        createAirplaneEAFP("Airbus", "D300", 0);
        countDivisibleBy7Numbers(6, 16);
    }
    public static void countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) {
        if (inferiorLimit < superiorLimit) {
            for (int i = inferiorLimit; i != superiorLimit; i++) {
                if (i % 7 == 0) {
                    System.out.println(i);
                }
            }
        } else System.out.println("InvalidRangeException");
    };

    public static void createAirplaneLBYL(String manufacturer, String model, int nrOfEngines){
        if (manufacturer=="" || manufacturer==null ){
            manufacturer = "Is empty";
        }
        if (model=="" || model==null){
            model = "Is empty";
        }
        if ( nrOfEngines!=0 || nrOfEngines%2==1){
            nrOfEngines = -1;
        }
        Airplane airplane = new Airplane(manufacturer, model, nrOfEngines);
        System.out.println(airplane.getManufacturer() + " " + airplane.getModel() + " " + airplane.getNrOfEngines());
    }
    public static void createAirplaneEAFP(String manufacturer, String model, int nrOfEngines){
        try {
            Airplane airplane = new Airplane(manufacturer, model, nrOfEngines);
            System.out.println(airplane.getManufacturer() + " " + airplane.getModel() + " " + airplane.getNrOfEngines());
        } catch(RuntimeException e ){
            System.out.println("The data is incorrectly specified!");
        }
    }
}
