package homework_nr_18;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaskManager manager = new TaskManager();
        Thread t1 = new Thread(()-> manager.addTask("Taking data as input from an external resource", Constants.ANSI_BLUE));
        Thread t2 = new Thread(()-> manager.addTask("Creating information",  Constants.ANSI_BLUE));
        Thread t3 = new Thread(()-> manager.addTask("Processing the data into something useful",  Constants.ANSI_BLUE));
        Thread t4 = new Thread(()-> manager.removeTask("Creating information", Constants.ANSI_PURPLE));
        Thread t5 = new Thread(()->manager.getTaskCount(Constants.ANSI_RED));
        Thread t6 = new Thread(()->manager.getAllTasks(Constants.ANSI_GREEN));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
