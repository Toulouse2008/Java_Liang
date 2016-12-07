/* Exercise 9-7 */

import java.util.Date;

public class E9_7_Account {
  public static void main(String[] args) {

    Account myAccount = new Account(1122, 20_000);

    myAccount.deposit(3000);
    myAccount.setAnnualInterestRate(4.5);
    System.out.println("New balance" + myAccount.getBalance());
    System.out.println("Monthly interest: " + myAccount.getMonthlyInterest());
    System.out.println("Date created: " + myAccount.getDateCreated());
  }

}

/* Define account class */
class Account {

  private static int id = 0;
  private static double balance = 0;
  private static double annualInterestRate = 0;
  private static Date dateCreated = new Date();

  Account() {

  }

  Account(int id, double balance) {
    this.id = id;
    this.balance = balance;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double amount) {
    this.balance += amount;
  }

  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestsRate) {
    this.annualInterestRate = annualInterestsRate / 100;
  }

  public Date getDateCreated() {
    return this.dateCreated;
  }

  public double getMonthlyInterestRate() {
    return this.annualInterestRate / 12;
  }

  public double getMonthlyInterest() {
    return this.balance * this.getMonthlyInterestRate();
  }

  public void withdraw(double amount) {
    this.balance -= amount;
  }

  public void deposit(double amount) {
    this.setBalance(amount);
  }
}
