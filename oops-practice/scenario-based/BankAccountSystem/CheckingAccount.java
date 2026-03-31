package BankAccountSystem;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String acc, double bal) {
        super(acc, bal);
    }

    public double calculateFee() {
        return getBalance() < 1000 ? 1.0 : 0.0;
    }
}
