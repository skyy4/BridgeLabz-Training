/*
 * Purpose: Savings account with simple interest calculation.
 * Extends: Account
 */
public class SavingsAccount extends Account {

    public SavingsAccount(String acc,double bal){
        super(acc,bal);
    }

    double calculateInterest(){
        return bal*0.04;
    }
}


