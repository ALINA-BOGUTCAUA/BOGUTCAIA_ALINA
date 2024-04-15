package homework_nr_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printDayPlan();
        System.out.println("__________________");

        LinkedList<String> Books = new LinkedList<>();
        Books.add("Pride and Prejudice");
        Books.add("Wuthering Heights");
        Books.add("Hobbit");
        Books.add("Pride and Prejudice");
        System.out.println(Books);
        PrintIndexOfBooks(Books);

        System.out.println("___________________");

    }

    public static void printDayPlan(){
        List<String> dayPlan = new ArrayList<>();
        dayPlan.add("Wake up");
        dayPlan.add("Have breakfast");
        dayPlan.add("Time to study in university");
        dayPlan.add("Relaxing");
        dayPlan.add("Doing homework");
        dayPlan.add("Washing");
        dayPlan.add("Go to bed");
        for (String element : dayPlan){
            System.out.println(element);
        }
    }
    public static void PrintIndexOfBooks(LinkedList<String> Books){
        for ( String element  : Books) {
            System.out.println("Index of " + element + "  is  " + Books.indexOf(element));
        }
    }

}
