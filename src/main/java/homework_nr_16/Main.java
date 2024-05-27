package homework_nr_16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/java/homework_nr_16/input.txt");
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<People> peopleList = new ArrayList<>();
        String readString = null;
        while ((readString = bufferedReader.readLine())!=null){
            peopleList.add(new People(readString));
        }
        System.out.println(peopleList.toString());
        bufferedReader.close();
        fileReader.close();

        File fileToWrite = new File("src/main/java/homework_nr_16/output.txt");
        FileWriter fileWriter = new FileWriter(fileToWrite);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        float sum = 0;
        int maxAge = -1000;
        String maxAgeName = null;
        int minAge = 1000;
        String minAgeName= null;
        for (int i=0; i!= peopleList.size(); i++){
            int peopleAge = peopleList.get(i).getAge();
            if (peopleAge>=maxAge){
                maxAge=peopleAge;
                maxAgeName = peopleList.get(i).getName();
            }
            if (peopleAge<minAge){
                minAge=peopleAge;
                minAgeName = peopleList.get(i).getName();
            }
            sum+=peopleList.get(i).getGrade();
        }
        float averageGrade = sum/peopleList.size();
        System.out.println(averageGrade);
        System.out.println(minAge);
        System.out.println(maxAge);
        bufferedWriter.write("Average grade: " + averageGrade + "\n");
        bufferedWriter.write("The youngest person: " + minAgeName + " ( Age: " + minAge + " )\n" );
        bufferedWriter.write("The oldest person: " + maxAgeName + " ( Age: " + maxAge + " )\n" );
        bufferedWriter.close();
        fileWriter.close();
    }
}
