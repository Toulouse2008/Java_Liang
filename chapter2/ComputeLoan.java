/** Listing 2.9 Compute loan */

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate, e.g., 7.25%: ");
        double AnnualInterestRate = input.nextDouble();
        double MonthlyInterestRate = AnnualInterestRate / 1200;
        System.out.print("Enter number of years as integer, e.g., 5: ");
        int NumberOfYears = input.nextInt();
        System.out.print("Enter loan amount, e.g., 12000.89:");
        double LoanAmount = input.nextDouble();
        double MonthlyPayment = LoanAmount * MonthlyInterestRate / (1-
            1 / Math.pow(1 + MonthlyInterestRate, NumberOfYears * 12));
        double TotalPayment = MonthlyPayment * NumberOfYears * 12;
        System.out.println("The monthly payment is $" + (int)(MonthlyPayment *
            100)/ 100.0);
        System.out.println("The total payment is $" + 
            (int)(TotalPayment * 100) / 100.0);
    }
}
