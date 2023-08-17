package abstraction.bankingsystem;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(1000.0, 5.0, 10000.0);
        System.out.println("Balance: " + checkingAccount.getBalance());

        checkingAccount.deposit(500.0);
        System.out.println("Current Balance: " + checkingAccount.getBalance());

        checkingAccount.withdraw(100.0);
        System.out.println("Current Balance: " + checkingAccount.getBalance());

        checkingAccount.deductFees();

        System.out.println("\n");

        SavingsAccount savingsAccount = new SavingsAccount(2000.0, 10.0);
        System.out.println("Balance: " + savingsAccount.getBalance());

        savingsAccount.deposit(200.0);
        System.out.println("Current Balance: " + savingsAccount.getBalance());

        savingsAccount.withdraw(400.0);
        System.out.println("Current Balance: " + savingsAccount.getBalance());

        savingsAccount.calculateInterest();
    }
}
