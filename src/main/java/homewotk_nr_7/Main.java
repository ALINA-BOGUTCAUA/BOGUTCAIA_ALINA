package homewotk_nr_7;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Alisa", "Baicev", "Adidas", 15, "Shoes");
        Programmer developer1 = new Programmer("Alex", "Creange", "Endava", "C#", 5);
        Manager manager2 = new Manager("Max", "Pack", "Puma", 2, "Clothes");
        Programmer developer2 = new Programmer("Oleg", "Moroz", "Google", "Java", 10);
        manager1.printMyName();
        manager1.work();

        developer1.printMyName();
        developer1.work();

        manager2.printMyName();
        manager2.work();

        developer2.printMyName();
        developer2.work();

        Person[] AllPersons = new Person[]{
                manager1, manager2, developer1, developer2
        };
        for (int index = 0; index!= AllPersons.length; index++){
            if (AllPersons[index] instanceof Manager ){
                ((Manager) AllPersons[index]).work();
            }

        }
    }
}
