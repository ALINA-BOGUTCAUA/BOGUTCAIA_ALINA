package homework_nr_8;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class Vocabular {
    public static void main(String[] args) {
        Map<String, String> Vocabular = new HashMap<>();
        Vocabular.put("Cow", "Vaca");
        Vocabular.put("Milk", "Lapte");
        Vocabular.put("Meadow", "Luncă");
        Vocabular.put("Bucket", "Găleată");
        Vocabular.put("Horns", "Coarne");
        Vocabular.put("Farm", "Fermă");
        Vocabular.put("Cow", "Vaca");
        Vocabular.put("Glass", "Iarbă");
        Vocabular.put("Beef", "Vită");
        Vocabular.put("Breed", "Rasă");
        System.out.println("English | Romanian");
        System.out.println("__________________");
        PrintVocabular(Vocabular);
    }
    private static void PrintVocabular(Map<String, String> Vocabular){
     for (String key : Vocabular.keySet()){
         System.out.println(key + " | " + Vocabular.get(key));
        }
    }
}
