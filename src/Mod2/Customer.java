package Mod2;

import java.util.Arrays;

public class Customer {
    private Account[] accounts;
    private String fullName;
    private int CustomerNumber;
    private static int customerNumberBase = 1000;
    private int numofAccounts;

    public Customer(String fullName) {
        accounts = new Account[10];
        this.fullName = fullName;
        this.CustomerNumber = customerNumberBase++;
        this.numofAccounts = 0;
    }

    public Account getAccount(int accNo) {
        if (accNo < accounts.length && numofAccounts != 0) {
            return accounts[accNo];
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Customer " +
                "fullName= '" + fullName + '\'' +
                ", CustomerNumber= " + CustomerNumber +
                ", numofAccounts= " + numofAccounts +
                "\n");

        for (int i = 0; i < numofAccounts; i++) {
            Account acc = getAccount(i);
            if (acc != null) {
                if (acc instanceof SavingAccount)
                    s.append( "Savings account with interest rate % ").append(((SavingAccount) acc).getInterestRate());
                else if (acc instanceof CheckingAccount)
                    s.append("Checking account with overdraft %").append(((CheckingAccount) acc).getOverdraftAmount());
                s.append(", balance $").append(acc.getBalance()).append("\n");
            }
        }
        return s.toString();
//        String s = "Customer{" +
//                "accounts=" + Arrays.toString(accounts) +
//                ", fullName='" + fullName + '\'' +
//                ", CustomerNumber=" + CustomerNumber +
//                ", numofAccounts=" + numofAccounts +
//                '}';
//        // мы перебираем все счета
//        for (int i = 0; i < this.numofAccounts; i++) {
//            Account acc = getAccount(i);
//            if (acc instanceof SavingAccount)
//                s=s+"\nSavings account with interest rate %"+((SavingAccount) acc).getInterestRate();
//            else
//                s=s+"\nChecking account with overdraft %"+((CheckingAccount) acc).getOverdraftAmount();
//            s=s+", balance $"+acc.getBalance();
//        }
//        return s;
    }
    public void addAccount (Account acc){
        accounts[numofAccounts]=acc;
        numofAccounts++;

    }
}
