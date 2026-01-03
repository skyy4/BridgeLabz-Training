public class BankAccountManager {

    private String accNo;
    private double bal;

    public BankAccountManager(String accNo,double bal){
        this.accNo=accNo;
        this.bal=bal;
    }

    public void deposit(double amt){
        if(amt<=0){
            System.out.println("Invalid deposit amount");
            return;
        }
        bal+=amt;
        System.out.println("Deposited: "+amt);
    }

    public void withdraw(double amt){
        if(amt<=0){
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if(amt>bal){
            System.out.println("Insufficient balance");
            return;
        }
        bal-=amt;
        System.out.println("Withdrawn: "+amt);
    }

    public void checkBalance(){
        System.out.println("Current Balance: "+bal);
    }

    public static void main(String[] args){
        BankAccountManager b=new BankAccountManager("SB101",5000);
        b.checkBalance();
        b.deposit(2000);
        b.withdraw(1000);
        b.withdraw(7000);
        b.checkBalance();
    }
}

