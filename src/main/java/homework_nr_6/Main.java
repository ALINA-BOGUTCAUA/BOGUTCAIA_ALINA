package homework_nr_6;

public class Main {
    public static void main(String[] args) {
        Employee vet =  new Employee("Oleg", 35, "Surgery");
        System.out.println("Name: " + vet.getName() + " Age: " + vet.getAge() + " Departmen: " +  vet.getDepartment());
        System.out.println("---------------------");
        Invoice mobile1 = new Invoice("iphone", "very good camera", 4, 12000d);
        System.out.println("  Model:" + mobile1.getModel() + "  Description:" +
                mobile1.getDescription() + "  Number Of products: " +
                mobile1.getNumberOfProducts() + "  Price: " + mobile1.getPrice() );

        System.out.println("Sum to pay: " +  mobile1.getAmount(mobile1.getNumberOfProducts(), mobile1.getPrice()));

        Invoice mobile2 = new Invoice("Xiaomi", "Made in China", -2, -100d);
        System.out.println(" Model:" + mobile2.getModel() + "  Description:" +
                mobile2.getDescription() + "  Number Of products: " +
                mobile2.getNumberOfProducts() + "  Price: " + mobile2.getPrice() );
        System.out.println("Sum to pay: " + mobile2.getAmount(mobile2.getNumberOfProducts(), mobile2.getPrice()));
        System.out.println("-------------------");
        Date date1 =  new Date();
        date1.setDay(12);
        date1.setMonth(2);
        date1.setYear(2004);
        Date.displayDate(date1.getDay(), date1.getMonth(), date1.getYear());

        Date date2 = new Date();
        date2.setDay(-1);
        date2.setMonth(0);
        date2.setYear(2100);
        Date.displayDate(date2.getDay(), date2.getMonth(), date2.getYear());

    }
}
