package homewotk_nr_7;

public class Manager extends Employee{
    int teamSize;
    String teamName;


    @Override
    public void work() {
        System.out.println("Manages the project");
    }

    public Manager(String name, String surname, String companyName, int teamSize, String teamName) {
        super(name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }
}
