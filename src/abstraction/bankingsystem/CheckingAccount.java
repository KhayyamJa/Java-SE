package abstraction.bankingsystem;

public class CheckingAccount extends AbstractBankAccount {

    private Double feeAmount;
    private Double feeThreshold;


    public CheckingAccount(Double balance, Double feeAmount, Double feeThreshold) {
        super(balance);
        this.feeAmount = feeAmount;
        this.feeThreshold = feeThreshold;
    }

    public void deductFees() {
        if (getBalance() < feeThreshold) {
            System.out.println("Fee deducted: " + (super.getBalance() - feeAmount));
        }
    }
}
