package Mod2;

import Mod2.Account;
import Mod2.Customer;
import Mod2.*;


public class TestAccount {
    public static void main(String[] args) {

        Customer firstCustomer = new Customer("Aleks");
        Customer secondCustomer = new Customer ("Miha");

        SavingAccount aleksSaving=new SavingAccount(1000, 5);
        CheckingAccount aleksAccount = new CheckingAccount(5000, 1000);
        CheckingAccount mihaAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(aleksSaving);
        firstCustomer.addAccount(aleksAccount);
        secondCustomer.addAccount (mihaAccount);
        
        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);

        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));

        Bank.getCustomer(0).getAccount(0).deposit(2000);
        Bank.getCustomer(0).getAccount(1).withdraw(5500);
        ((SavingAccount)Bank.getCustomer(0).getAccount(0)).addInterestRate();

//        Account account = Bank.getCustomer(0).getAccount(1);
//        if (account != null) {
//            account.withdraw(5500);
//        } else {
//            System.out.println("Account is null, cannot withdraw.");
//        }
//     //Bank.getCustomer(0).getAccount(1).withdraw(5500);
//        ((SavingAccount)Bank.getCustomer(0).getAccount(0)).addInterestRate();
//        System.out.println(Bank.getCustomer(0).getAccount(0).getBalance());
//        System.out.println(Bank.getCustomer(0).getAccount(1).getBalance());
//        //выведем на экран снова после проведения операции
        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));



    }
}