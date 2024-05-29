package homework_nr_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskManager {
    List<String> taskManagerList = new ArrayList<>();
    private final Object addTaskLock = new Object();
    private final Object removeTaskLock = new Object();
    private final Object CountTaskLock = new Object();
    private final Object AllTaskLock = new Object();
    public void addTask(String task,  String color){
        synchronized (addTaskLock) {
            taskManagerList.add(task);
            System.out.println(color + task);
        }
    }

    public void removeTask(String task, String color){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (removeTaskLock) {
            for (int index = 0; index != taskManagerList.size(); index++) {
                String element = taskManagerList.get(index);

                if (element.equals(task)) {
                    taskManagerList.remove(element);
                    System.out.println(color + "Element was removed!");
                    break;
                }
            }
        }
    }
    public void getTaskCount(String color){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (CountTaskLock) {
            System.out.println(color + "Count of tasks: " + taskManagerList.size());
        }
    }
    public void getAllTasks(String color){
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (AllTaskLock) {
            for (int index = 0; index != taskManagerList.size(); index++) {
                System.out.println(color + taskManagerList.get(index));
            }
        }
    }
}




