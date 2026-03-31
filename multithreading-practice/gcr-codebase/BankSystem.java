import java.time.LocalTime;

class BankAccount {
    int bal = 10000;

    void withdraw(String n, int amt) {
        System.out.println("[" + n + "] Attempting to withdraw " + amt);
        if (bal >= amt) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            bal -= amt;
            System.out.println("Success: " + n + ", Amount: " + amt +
                    ", Balance: " + bal + " at " + LocalTime.now());
        } else {
            System.out.println("Failed: " + n + " Insufficient balance");
        }
    }
}

class Txn implements Runnable {
    BankAccount a;
    String n;
    int amt;

    Txn(BankAccount a, String n, int amt) {
        this.a = a;
        this.n = n;
        this.amt = amt;
    }

    public void run() {
        a.withdraw(n, amt);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();

        int[] amts = { 3000, 4000, 2000, 5000, 1500 };
        for (int i = 0; i < amts.length; i++) {
            Thread t = new Thread(new Txn(a, "Customer-" + (i + 1), amts[i]));
            System.out.println(t.getName() + " state: " + t.getState());
            t.start();
        }
    }
}
