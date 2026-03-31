import java.time.LocalTime;

class Task extends Thread {
    Task(String n) {
        super(n);
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}

public class ThreadStateMonitor {
    public static void main(String[] args) throws InterruptedException {
        Task t1 = new Task("Task-1");
        Task t2 = new Task("Task-2");

        System.out.println("State: " + t1.getState());
        t1.start();
        t2.start();

        while (t1.isAlive() || t2.isAlive()) {
            System.out.println("[Monitor] " + t1.getName() + " - " +
                    t1.getState() + " at " + LocalTime.now());
            System.out.println("[Monitor] " + t2.getName() + " - " +
                    t2.getState() + " at " + LocalTime.now());
            Thread.sleep(500);
        }

        System.out.println("Monitoring complete");
    }
}
