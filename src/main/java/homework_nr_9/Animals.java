package homework_nr_9;

public interface Animals {

    static void Size(){
        System.out.println("It has a standard size ");
    }

    default void habitat(){
        return;
    }

    void FamilyMember();

    void weight();

    Integer maxSizeOfElephant = 5;

    Integer maxWeight = 6600;

}
