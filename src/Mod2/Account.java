package Mod2;
/**
 * Bank Account class
 * @author OleksiiB
 */
public class Account {
    protected double balance;

    /**
     * constructor - assigns the initial balance value
     * @param balance must be positive account
     */
    public Account(double balance) {
        // Next we use IF, since through the constructor
        // we can assign (эсаин - присвоить) the wrong balance (неправильный баланс)
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public Account() {

    }

    // The amount we deposit account must exceed the balance (сумма, которую мы вносим на счет,
    // должна превышать баланс)
    /**
     * @param amt a positive amount of money
     */
    public boolean deposit (double amt){
        if (amt>0){
            balance+=amt;
            return true;
        }
        return false;
    }


    /**
     * Methot to withdraw money
     * @param amt a positive amount of money
     */
    // The amount we deposit account must not exceed the balance
    // (сумма, которую мы вносим на счет, должна превышать баланс)
    public boolean withdraw (int amt){
        if (amt<=0){
            balance-=amt;
            return true;
        }
        return false;
    }

    /**
     * Method to check account balance
     * @return the balance
     */
        public double getBalance () {
            return balance;
        }


}
