/*
 * Purpose: Thrown when a withdrawal exceeds the current account balance.
 * Thrown by: Account.withdraw(double)
 */
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}


