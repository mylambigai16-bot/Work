package handsOn_8_ExceptionHandling;

//Custom exception for invalid payout
class PayOutOfBoundsException extends Exception {
 public PayOutOfBoundsException(String message) {
     super(message);
 }
}

//Account management class
class AccountManagement {
 private double balance = 80000;      // Current balance
 private final double MAX_TRANSACTION = 30000; // Maximum transaction limit

 // Method to check if a debit transaction is allowed
 public void checkForDebit(double amount) throws PayOutOfBoundsException {
     if (amount > MAX_TRANSACTION) {
         throw new PayOutOfBoundsException("Transaction amount exceeds maximum limit of " + MAX_TRANSACTION);
     }
     if (amount > balance) {
         throw new PayOutOfBoundsException("Insufficient balance for transaction. Current balance: " + balance);
     }
 }

 // Method to withdraw amount
 public void withdrawAmount(double amount) {
     try {
         checkForDebit(amount);   // Check before withdrawal
         balance -= amount;       // Deduct amount
         System.out.println("Transaction successful! Withdrawn: " + amount);
         System.out.println("Remaining balance: " + balance);
     } catch (PayOutOfBoundsException e) {
         System.out.println("Transaction failed: " + e.getMessage());
     }
 }
}

//Test class
public class TransactionTest {
 public static void main(String[] args) {
     AccountManagement account = new AccountManagement();

     // Test transactions
     account.withdrawAmount(25000);   // Valid transaction
     account.withdrawAmount(35000);   // Exceeds max limit
     account.withdrawAmount(60000);   // Exceeds current balance
     account.withdrawAmount(15000);   // Valid transaction
 }
}
