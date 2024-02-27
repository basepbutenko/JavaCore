package Mod2.test;

import Mod2.domain.Account;


public class TestAccount {
    public static void main(String[] args) {
        Account myAccount = new Account( 255.86);
       // myAccount.deposit(120);
        myAccount.withdraw(380);
        myAccount.withdraw(500);
        System.out.println("Account balance is $" + myAccount.getBalance());
        System.out.println("Hello");
    }
}
