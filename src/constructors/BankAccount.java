package constructors;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        BankAccount bankAccount = new BankAccount(accountNumber, accountHolderName);

        System.out.println("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        bankAccount.deposit(depositAmount);

        System.out.println("Enter Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();
        bankAccount.withdraw(withdrawAmount);

        bankAccount.display();


    }

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;

        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;

            } else {
                System.out.println("Insufficient funds");
            }

        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + this.balance);
    }
}
