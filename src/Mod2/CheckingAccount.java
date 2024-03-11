package Mod2;

public class CheckingAccount extends Account {
    private double overdraftAmount;

    public CheckingAccount(double balance, double overdraftAmount) {
        super(balance);
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }

    public boolean withdraw(double amt) {
        if (amt <= balance + overdraftAmount) {
            balance = balance - amt;
            return true;
        }
        return false;

    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

}
