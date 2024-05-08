package homework_nr_13;

import java.util.Objects;

public class Airplane {
    private String manufacturer;
    private String model;
    private int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) {
        this.manufacturer =InvalidManufacturerException(manufacturer);
        this.model = InvalidModelException(model);
        this.nrOfEngines = InvalidNrOfEngines(nrOfEngines);
    }
    public String InvalidManufacturerException (String airplane){
        if (Objects.equals(airplane, "") || airplane==null ){
            airplane = "Is empty";
        } else {this.manufacturer = airplane;}
        return airplane;
    };
    public String InvalidModelException (String airplane){
        if (Objects.equals(airplane, "") || airplane==null ){
            airplane = "Is empty";
        } else {this.model = airplane;}
        return airplane;
    };
    public int InvalidNrOfEngines(int nrOfEngines){
        if (nrOfEngines==0 || nrOfEngines%2==1){
            nrOfEngines = -1;
        } else {
            this.nrOfEngines=nrOfEngines;
        }
        return nrOfEngines;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrOfEngines() {
        return nrOfEngines;
    }

    public void setNrOfEngines(int nrOfEngines) {
        this.nrOfEngines = nrOfEngines;
    }

}
