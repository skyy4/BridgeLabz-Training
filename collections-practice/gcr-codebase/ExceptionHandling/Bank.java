class InsufficientBalanceException extends Exception {
}

public class Bank {

    static double bal = 5000;

    static void withdraw(double amt)
            throws InsufficientBalanceException {

        if (amt < 0)
            throw new IllegalArgumentException();
        if (amt > bal)
            throw new InsufficientBalanceException();
        bal -= amt;
    }

    public static void main(String[] args) {
        try {
            withdraw(6000);
            System.out.println("Withdrawal successful, new balance: " + bal);
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}
