import java.util.*;
import java.io.*;

public class BankAccount {
    protected String accountHolder; // protected access specifier, can only be inherited
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;  //this keyword to differentiate between the instance and local variables
        this.balance = balance;
    }

    public void deposit(double amount) {  // Deposit function
        balance += amount;
        System.out.println("Deposited: Rs" + amount);
    }

    public void withdraw(double amount) {  // Withdraw function
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {          // Display function
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: Rs" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest Added: Rs" + interest);
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("John Doe", 1000, 5.0);

        myAccount.displayBalance();
        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.addInterest();
        myAccount.displayBalance();
    }
}
