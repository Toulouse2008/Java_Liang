/** Listing 10.1 Test Loan Class  */

import java.util.Scanner;

public class Listing101_TestLoan {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Enter the annual interest
    System.out.print("Enter annual interest rate: ");
    double annualInterestRate = input.nextDouble();

    // Enter number of years
    System.out.println("Enter number of years: ");
    int numberOfYears = input.nextInt();

    // Enter loan amount
    System.out.println("Enterh loan amount: ");
    double loanAmount = input.nextDouble();

    // Create a loca object
    Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

    // Display loan date, monthly payment, and total payment
    System.out.printf("The loan was created on %s\nThe monthly payment is %.2f\n" +
           "The total payment is %.2f\n",
           loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
  }
}

// Define Loan class
class Loan {
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  // Default constructor
  public Loan() {
    this(2.5, 1, 1000);
  }

  // Construct a loan with specified annual interest rate, number of years, and
  //loan amount
  public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

  // Return number of years
  public int getNumberOfYears() {
    return numberOfYears;
  }

  // Set a new numberOfYears
  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  // Return loanAmount
  public double getLoanAmount() {
    return loanAmount;
  }

  // Set a new loanAmount
  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  // Find monthly payment
  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    return monthlyPayment;
  }

  // Find total payment
  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;
  }

  // Return loan Date
  public java.util.Date getLoanDate() {
    return loanDate;
  }
}
