package homewotk_nr_7;

public abstract class Person {
    String name;
    String surname;
    public void  printMyName(){
        System.out.println(" Name: " + name + " Surname: " + surname);
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
