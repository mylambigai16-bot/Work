//abstraction;
package HandsOn_5_Abstraction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Abstract Payment class
abstract class Payment {
    protected String transactionId;
    protected double amount;
    protected String customerName;
    protected String paymentStatus; // "Pending", "Success", "Failed", "Validation Failed"

    Payment(String transactionId, double amount, String customerName) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.customerName = customerName;
        this.paymentStatus = "Pending";
    }

    // Abstract methods
    public abstract boolean validatePayment();
    public abstract boolean processPayment();

    // Template Method
    public void executeTransaction() {
        if (validatePayment()) {
            if (processPayment()) {
                setPaymentStatus("Success");
            } else {
                setPaymentStatus("Failed");
            }
        } else {
            setPaymentStatus("Validation Failed");
        }
        generateReceipt();
    }

    public void generateReceipt() {
        System.out.println("\n----- Payment Receipt -----");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: Rs." + amount);
        System.out.println("Payment Status: " + paymentStatus);
        System.out.println("Timestamp: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("---------------------------\n");
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }
}

// CreditCardPayment
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cvv;
    private String expireDate;

    CreditCardPayment(String transactionId, double amount, String customerName,
                      String cardNumber, String cvv, String expireDate) {
        super(transactionId, amount, customerName);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expireDate = expireDate;
    }

    @Override
    public boolean validatePayment() {
        if (cardNumber.length() != 16) return false;
        if (cvv.length() != 3) return false;
        if (expireDate.length() != 5 || expireDate.charAt(2) != '/') return false;

        int month = Integer.parseInt(expireDate.substring(0, 2));
        int year = Integer.parseInt(expireDate.substring(3, 5));
        int currentYear = LocalDateTime.now().getYear() % 100;

        return month >= 1 && month <= 12 && year >= currentYear;
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing Credit Card Payment...");
        return true;
    }
}

// UPIPayment
class UPIPayment extends Payment {
    private String upiId;
    private String upiPin;

    UPIPayment(String transactionId, double amount, String customerName, String upiId, String upiPin) {
        super(transactionId, amount, customerName);
        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    @Override
    public boolean validatePayment() {
        if (!upiId.contains("@")) return false;
        return upiPin.length() == 4 || upiPin.length() == 6;
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing UPI Payment...");
        return true;
    }
}

// NetBankingPayment
class NetBankingPayment extends Payment {
    private String bankName;
    private String accountNumber;
    private String ifscCode;

    NetBankingPayment(String transactionId, double amount, String customerName,
                       String bankName, String accountNumber, String ifscCode) {
        super(transactionId, amount, customerName);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    @Override
    public boolean validatePayment() {
        if (accountNumber.length() < 9) return false;
        if (ifscCode.length() != 11) return false;
        return true;
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing NetBanking Payment...");
        return true;
    }
}

// Main class
public class OnlinePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card Payment");
        System.out.println("2. UPI Payment");
        System.out.println("3. NetBanking Payment");
        int paymentMode = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Transaction ID:");
        String transactionId = sc.nextLine();
        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();

        Payment payment = null;

        switch (paymentMode) {
            case 1 -> {
                System.out.println("Enter Card Number:");
                String cardNumber = sc.nextLine();
                System.out.println("Enter CVV:");
                String cvv = sc.nextLine();
                System.out.println("Enter Expiry Date (MM/YY):");
                String expiryDate = sc.nextLine();
                payment = new CreditCardPayment(transactionId, amount, customerName, cardNumber, cvv, expiryDate);
            }
            case 2 -> {
                System.out.println("Enter UPI ID:");
                String upiId = sc.nextLine();
                System.out.println("Enter UPI PIN:");
                String upiPin = sc.nextLine();
                payment = new UPIPayment(transactionId, amount, customerName, upiId, upiPin);
            }
            case 3 -> {
                System.out.println("Enter Bank Name:");
                String bankName = sc.nextLine();
                System.out.println("Enter Account Number:");
                String accountNumber = sc.nextLine();
                System.out.println("Enter IFSC Code:");
                String ifscCode = sc.nextLine();
                payment = new NetBankingPayment(transactionId, amount, customerName, bankName, accountNumber, ifscCode);
            }
            default -> {
                System.out.println("Invalid Payment Mode!");
                sc.close();
                return;
            }
        }

        // Execute transaction using template workflow
        payment.executeTransaction();
        sc.close();
    }
}
