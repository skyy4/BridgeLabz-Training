class Chef extends Thread {
    String d;
    int t;

    Chef(String n, String d, int t) {
        super(n);
        this.d = d;
        this.t = t;
    }

    public void run() {
        System.out.println(getName() + " started preparing " + d);
        for (int p = 25; p <= 100; p += 25) {
            try {
                Thread.sleep(t * 250);
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + " preparing " + d + ": " + p + "%");
        }
    }
}

public class Restaurant {
    public static void main(String[] args) throws InterruptedException {
        Thread c1 = new Chef("Chef-1", "Pizza", 3);
        Thread c2 = new Chef("Chef-2", "Pasta", 2);
        Thread c3 = new Chef("Chef-3", "Salad", 1);
        Thread c4 = new Chef("Chef-4", "Burger", 2);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
