import java.util.*;

public class NewAccount {
    // Attributes
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    // Constructor
    public NewAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Method
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        transactions.add(new Transaction('w', amount, this.balance, "NULL"));
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, this.balance, "NULL"));
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }
}