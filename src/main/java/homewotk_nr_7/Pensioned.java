package homewotk_nr_7;

public abstract class Pensioned  extends Person {
    String refireDate;
    int age;

    public Pensioned(String name, String surname, String refireDate, int age) {
        super(name, surname);
        this.refireDate = refireDate;
        this.age = age;
    }
}
