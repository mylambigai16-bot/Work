package HandsOn_6_oops;

class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class RBI {
    Customer c;  // HAS-A relationship
    Account a;   // HAS-A relationship

    public RBI(Customer c, Account a) {
        this.c = c;
        this.a = a;
    }

    // Default RBI guidelines
    public double getInterestRate() {
        return 4.0; // minimum 4%
    }

    public double getWithdrawalLimit() {
        return 50000; // default limit
    }

    public void displayDetails() {
        c.displayCustomer();
        a.displayAccount();
        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println("Withdrawal Limit: " + getWithdrawalLimit());
    }
}
class SBI extends RBI {

    public SBI(Customer c, Account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 5.5; // greater than RBI minimum
    }

    @Override
    public double getWithdrawalLimit() {
        return 100000;
    }
}
class ICICI extends RBI {

    public ICICI(Customer c, Account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 6.0;
    }

    @Override
    public double getWithdrawalLimit() {
        return 150000;
    }
}
class PNB extends RBI {

    public PNB(Customer c, Account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 4.5;
    }

    @Override
    public double getWithdrawalLimit() {
        return 75000;
    }
}


public class BankingMain {
    public static void main(String[] args) {

        Customer c1 = new Customer("Mylu", 22);
        Account a1 = new Account(101, 50000);

        // Dynamic Polymorphism
        RBI bank;

        System.out.println("------ SBI ------");
        bank = new SBI(c1, a1);
        bank.displayDetails();

        System.out.println("\n------ ICICI ------");
        bank = new ICICI(c1, a1);
        bank.displayDetails();

        System.out.println("\n------ PNB ------");
        bank = new PNB(c1, a1);
        bank.displayDetails();
    }
}