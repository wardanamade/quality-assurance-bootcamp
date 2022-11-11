// Create a Class with the name BankAccount

public class BankAccount {
    // Create a private variable with the name accountNumber of type int
    private int accountNumber;
    // Create a private variable with the name balance of type double
    private double balance;
    // Create a private variable with the name customerName of type String
    private String customerName;
    // Create a private variable with the name email of type String
    private String email;
    // Create a private variable with the name phoneNumber of type String
    private String phoneNumber;

    // Create a public method with the name getAccountNumber with no parameters and return type int
    public int getAccountNumber() {
        return accountNumber;
    }

    // Create a public method with the name setAccountNumber with one parameter of type int and return type void
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Create a public method with the name getBalance with no parameters and return type double
    public double getBalance() {
        return balance;
    }

    // Create a public method with the name setBalance with one parameter of type double and return type void
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Create a public method with the name getCustomerName with no parameters and return type String
    public String getCustomerName() {
        return customerName;
    }

    // Create a public method with the name setCustomerName with one parameter of type String and return type void
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Create a public method with the name getEmail with no parameters and return type String
    public String getEmail() {
        return email;
    }

    // Create a public method with the name setEmail with one parameter of type String and return type void
    public void setEmail(String email) {
        this.email = email;
    }

    // Create a public method with the name getPhoneNumber with no parameters and return type String
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Create a public method with the name setPhoneNumber with one parameter of type String and return type void
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Create a public method with the name deposit with one parameter of type double and return type void
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
    }

    // Create a public method with the name withdraw with one parameter of type double and return type void
    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance = " + this.balance);
        }
    }
}
