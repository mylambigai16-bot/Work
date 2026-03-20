//ClassesObjects;
package HandsOn_4_classobject;

class Account {
    // Private data members
    private String id;
    private String name;
    private int balance;

    // Constructor with default balance 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Constructor with initial balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Credit operation
    public int credit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid credit amount");
        }
        return balance;
    }

    // Debit operation
    public int debit(int amount) {
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid debit amount");
        }
        return balance;
    }

    // Transfer funds to another account
    public int transferTo(Account another, int amount) {
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else if (amount > 0) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Invalid transfer amount");
        }
        return balance;
    }

    // String representation of account
    public String toString() {
        return "Account ID: " + id + "\n" +
               "Account Holder: " + name + "\n" +
               "Balance: Rs." + balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating accounts
        Account acc1 = new Account("A101", "Alice", 5000);
        Account acc2 = new Account("B102", "Bob");

        // Display initial accounts
        System.out.println("Initial Account Details:");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println();

        // Credit operation
        acc2.credit(2000);
        System.out.println("After crediting Rs.2000 to Bob:");
        System.out.println(acc2);
        System.out.println();

        // Debit operation
        acc1.debit(1000);
        System.out.println("After debiting Rs.1000 from Alice:");
        System.out.println(acc1);
        System.out.println();

        // Transfer operation
        acc1.transferTo(acc2, 1500);
        System.out.println("After transferring Rs.1500 from Alice to Bob:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}

