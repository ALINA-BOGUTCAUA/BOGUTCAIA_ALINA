package homework_nr_9;

public class Main {
    public static void main(String[] args) {
        Elephant elephantMic = new Elephant();
        elephantMic.FamilyMember();
        elephantMic.habitat();
        elephantMic.weight();
        Animals.Size();
        System.out.println("Max size of elephant: " + Elephant.maxSizeOfElephant + " metres");
        System.out.println("Max weight of elephant: " + Elephant.maxWeight + " kg");

        System.out.println("______________");

        Erbivor bigElephant = new Elephant();
        bigElephant.Eating();
        bigElephant.favoriteFood();

    }
}
