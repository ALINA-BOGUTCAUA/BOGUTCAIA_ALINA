package homewotk_nr_7;

public abstract class Employee extends Person {
    String companyName;
    public abstract void work();

    public Employee(String name, String surname, String companyName) {
        super(name, surname);
        this.companyName = companyName;
    }
}
