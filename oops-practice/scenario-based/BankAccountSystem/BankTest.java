package BankAccountSystem;

public class BankTest {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("12345", 1000.0);
        System.out.printf("%.2f%n", savings.calculateFee());

        BankAccount check1 = new CheckingAccount("222", 1500);
        System.out.printf("%.2f%n", check1.calculateFee());

        BankAccount check2 = new CheckingAccount("333", 500);
        System.out.printf("%.2f%n", check2.calculateFee());
    }
}
