package demo;

public class Customer {
    private int accountNumber;
    private double balance;

    public Customer(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Customer(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

