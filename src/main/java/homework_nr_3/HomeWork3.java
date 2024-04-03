package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {
        int Month = 3;
        switch (Month){
            case 1:
                System.out.println("It's January");
                break;
            case 2:
                System.out.println("It's February");
                break;
            case 3:
                System.out.println("It's March");
                break;
            case 4:
                System.out.println("It's April");
                break;
            case 5:
                System.out.println("It's May");
                break;
            case 6:
                System.out.println("It's June");
                break;
            case 7:
                System.out.println("It's July");
                break;
            case 8:
                System.out.println("It's August");
                break;
            case 9:
                System.out.println("It's September");
                break;
            case 10:
                System.out.println("It's October");
                break;
            case 11:
                System.out.println("It's November");
                break;
            case 12:
                System.out.println("It's December");
                break;
            default:
                System.out.println("You didn't choose month!");

        }
        System.out.println("-------------");
        for (int i = 100; i <= 1000; i++){
            if( i % 5 == 0){
                System.out.println( i );
            }
        }
        System.out.println("-------------");
        float  Sum = 0;
        float m = 1;
        float n = 3;
        while (n < 100){
            Sum = Sum + m / n;
            System.out.println(m + "/"+ n + "=" + "Old Summa +" + Sum);
            m = n;
            n += 2 ;
        }
    }
}
