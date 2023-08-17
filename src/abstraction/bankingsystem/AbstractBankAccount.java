package abstraction.bankingsystem;

public abstract class AbstractBankAccount implements BankAccount {

    private Double balance;

    public AbstractBankAccount(Double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(Double amount) {
        balance += amount;
        System.out.println("Add: " + amount);
    }

    @Override
    public void withdraw(Double amount) {
        if (balance < amount) {
            throw new RuntimeException("Insufficient amount");
        }
        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}

