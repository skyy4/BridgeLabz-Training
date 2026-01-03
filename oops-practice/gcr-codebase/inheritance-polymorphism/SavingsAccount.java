class BankAccount {
    int accNo;
    double balance;

    public BankAccount(int accNo,double balance){
        this.accNo=accNo;
        this.balance=balance;
    }
}

public class SavingsAccount extends BankAccount {
    double interest;

    public SavingsAccount(int a,double b,double i){
        super(a,b);
        interest=i;
    }

    void displayAccountType(){
        System.out.println("Savings Account");
    }
}

