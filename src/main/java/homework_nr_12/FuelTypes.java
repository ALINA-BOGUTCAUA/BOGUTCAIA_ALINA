package homework_nr_12;

import java.util.function.Predicate;

public enum FuelTypes {
    GASOLINE,
    DIESEL,
    BIODIESEL,
    ETHANOL,
    NATURAL_GAS,
    HYDROGEN,
    ELECTRIC,
    LPG;
    public boolean isLiquidFuel(){
        return this != ELECTRIC;
    }
}
