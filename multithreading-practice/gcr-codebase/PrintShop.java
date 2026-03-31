class PrintJob implements Runnable {
    String n;
    int p;

    PrintJob(String n, int p) {
        this.n = n;
        this.p = p;
    }

    public void run() {
        for (int i = 1; i <= p; i++) {
            System.out.println("Printing " + n + " - Page " + i + " of " + p);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class PrintShop {
    public static void main(String[] args) throws InterruptedException {
        long s = System.currentTimeMillis();

        Thread j1 = new Thread(new PrintJob("Job1", 10));
        Thread j2 = new Thread(new PrintJob("Job2", 5));
        Thread j3 = new Thread(new PrintJob("Job3", 15));
        Thread j4 = new Thread(new PrintJob("Job4", 8));
        Thread j5 = new Thread(new PrintJob("Job5", 12));

        j1.setPriority(5);
        j2.setPriority(8);
        j3.setPriority(3);
        j4.setPriority(6);
        j5.setPriority(7);

        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();
        j1.join();
        j2.join();
        j3.join();
        j4.join();
        j5.join();

        System.out.println("All jobs completed in " +
                (System.currentTimeMillis() - s) + "ms");
    }
}
