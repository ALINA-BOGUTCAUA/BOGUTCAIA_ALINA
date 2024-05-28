package homework_nr_17;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = ()->{
            String color = Contants.ANSI_RED;
            printLetters(color);
        };
        Runnable r2 = ()->{
            String color = Contants.ANSI_BLUE;
            printLetters(color);
        };
        Runnable r3 = ()->{
            String color = Contants.ANSI_GREEN;
            printLettersSleep(color);
        };
        Runnable r4 = ()->{
            String color = Contants.ANSI_PURPLE;
            printLettersSleep(color);
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        t1.start();
        t2.start();
        t3.start();
        t3.interrupt();
        t4.start();

    }
    public static synchronized void  printLetters(String color){
        char ch;
        for (ch='A'; ch<='Z'; ch++){
            System.out.println(color + ch);
        }

    }
    public static  void  printLettersSleep(String color){
        char ch;
        for (ch='A'; ch<='Z'; ch++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(color + "I was interrupted!");
            }
            System.out.println(color + ch);
        }

    }
}
