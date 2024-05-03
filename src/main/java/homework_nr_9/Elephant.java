package homework_nr_9;

public class Elephant extends Erbivor implements Animals {

    @Override
    public void habitat() {
        System.out.println("It's from Africa");;
    }

    @Override
    public void FamilyMember() {
        System.out.println("Child");

    }

    @Override
    public void weight() {
        System.out.println("It's 600 kg");
    }

    @Override
    void Eating() {
        System.out.println(" It eats grass.");
    }
}
