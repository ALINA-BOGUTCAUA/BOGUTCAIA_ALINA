package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {

        int[] numbers = new  int[100];
        int elementValue = 100;

        for (int i = 0; i!= numbers.length; i++){
            numbers[i] =  elementValue-- ;
            System.out.println("Number[" + i + "] = " + numbers[i]);
        }

        int Sum = 0;
        long Product = 1;
        for (int i = 0; i!= numbers.length; i++){
            if (numbers[i]%2 == 0){
                Sum += numbers[i];
            } else{ Product *= numbers[i];
            }
        }
        System.out.println("Sum of even elements:");
        System.out.println(Sum);

        System.out.println("Product of edd elements:");
        System.out.println(Product);

        System.out.println("Copy of numbers:");

        int[] copyNumbers = new int[100];
        for (int i = 0; i != copyNumbers.length; i++){
            copyNumbers[i] = numbers[i];
            System.out.println("copyNumber[" + i + "] = " + copyNumbers[i]);
        }
    }
}
