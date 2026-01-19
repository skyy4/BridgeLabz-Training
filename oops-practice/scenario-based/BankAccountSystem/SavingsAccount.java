package BankAccountSystem;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String acc, double bal) {
        super(acc, bal);
    }

    public double calculateFee() {
        return getBalance() * 0.005;
    }
}
