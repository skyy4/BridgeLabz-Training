/*
 * Purpose: Banking operations contract for deposit and withdrawal.
 * Implemented by: Account
 */
public interface BankService {
    void deposit(double amt);
    void withdraw(double amt) throws InsufficientBalanceException;
}


