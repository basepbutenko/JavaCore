package Mod2;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double initBalance, double interestRate) {
        super();
        this.balance=initBalance;
        this.interestRate=interestRate;
    }
  //  public void addInterestRate(){
    //    this.balance=this.balance+this.balance*interestRate/100;
   // }

    public double getInterestRate() {
        return interestRate;
    }
    public void addInterestRate(){
        this.balance=this.balance+this.balance*interestRate/100;
    }

}
