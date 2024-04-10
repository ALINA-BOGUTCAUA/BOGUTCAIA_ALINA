package homewotk_nr_7;

public class Programmer extends Employee {
    String programmingLanguage;
    int yearsOfExperience;
    @Override
    public void work() {
        System.out.println("Creates Apps");
    }

    public Programmer(String name, String surname, String companyName, String programmingLanguage, int yearsOfExperience) {
        super(name, surname, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }
}
