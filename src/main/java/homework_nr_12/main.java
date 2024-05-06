package homework_nr_12;


import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        System.out.println("-----------Months-----------");
        Months[] allMonths = Months.values();
        for (int i=0; i!=allMonths.length; i++){
            printAllMonths(allMonths, i);
        }
        System.out.println("------------Fuel Types -------------");

        printFuelTypes(FuelTypes.ELECTRIC);
        printFuelTypes(FuelTypes.BIODIESEL);
        System.out.println("-------Check Integer----------");

        int number1 = 10;
        printCheckInteger(CheckInteger.CHECK_IF_EVEN, number1);
        int number2 = 1;
        printCheckInteger(CheckInteger.CHECK_IF_NEGATIVE, number2);
    }

    public static void printAllMonths(Months[] month, int i){
        int m = i+1;
        System.out.println("Name of " +  m + " month is: " + month[i]);
    }
    public static void printFuelTypes(FuelTypes type){
        if (type.liquidFuel){
            System.out.println(type + " is liquid fuel");
        }
        else System.out.println(type + " isn't liquid fuel ");
    }
    public static void printCheckInteger(CheckInteger type, Integer number){
        System.out.println(number + " " + type + " is " +  type.Check.test(number) );
    }

    }

