package homework_nr_12;

import java.util.function.Predicate;

public enum FuelTypes {
    GASOLINE(true),
    DIESEL(true),
    BIODIESEL(true),
    ETHANOL(false),
    NATURAL_GAS(false),
    HYDROGEN(true),
    ELECTRIC(false),
    LPG(false);
    public boolean liquidFuel;
    FuelTypes(boolean liquidFuel) {
        this.liquidFuel = liquidFuel;
    }

}
