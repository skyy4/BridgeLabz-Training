public class BankAccountAccess {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccountAccess(String acc,String holder,double balance){
        this.accountNumber=acc;
        this.accountHolder=holder;
        this.balance=balance;
    }

    public void setBalance(double bal){
        balance=bal;
    }

    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccountAccess {

    public SavingsAccount(String acc,String holder,double bal){
        super(acc,holder,bal);
    }

    public void display(){
        System.out.println("Account: "+accountNumber);
        System.out.println("Holder: "+accountHolder);
        System.out.println("Balance: "+getBalance());
    }

    public static void main(String[] args){
        SavingsAccount s=new SavingsAccount("SB01","Rohit",5000);
        s.display();
    }
}

