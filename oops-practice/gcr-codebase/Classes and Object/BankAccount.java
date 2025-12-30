public class BankAccount {
    private String name,acc;
    private double bal;

    public BankAccount(String name,String acc,double bal){
        this.name=name;
        this.acc=acc;
        this.bal=bal;
    }

    public void deposit(double amt){
        bal+=amt;
        System.out.println("Deposited: "+amt);
        System.out.println("Current balance: "+bal);
    }

    public void withdraw(double amt){
        if(amt<=bal){
            bal-=amt;
            System.out.println("Withdraw amount is : "+amt);
            System.out.println("Current balance: "+bal);
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args){
        BankAccount b=new BankAccount("State of Chennai","123",700);
        System.out.println("Current balance: 700.0");
        b.deposit(200);
        b.withdraw(100);
        b.withdraw(1000);
    }
}

