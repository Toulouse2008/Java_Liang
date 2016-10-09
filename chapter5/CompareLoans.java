/** 5.21 Financial application: compare loans with various interests rates
 *  Write a program that let the user enter the loan amount and loan period in
 *  number of years and display the monthly and total payments for each interest
 *  rate starting from 5% to 8% with increment of 1/8.
 */
 import java.util.Scanner;

 public class CompareLoans {
   public static void main(String[] args) {

     // Get the inputs from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the amount and loan peroid: ");
     double loanAmount = input.nextDouble();
     int numberOfYears = input.nextInt();

     // Calculate and display the table
     // Table head
     System.out.println("Interest Rate\t" + "Monthly Pament\t" + "Total Payment");

     // calculation and table body
     double rate = 0.05;
     double increment = 0.00125;
     while (rate < 0.081){
       double monthlyInterestRate = rate / 12;
       
       double monthlyPayment = loanAmount * monthlyInterestRate / (1-
            1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

       System.out.printf("%-5.3f%%\t\t%-5.2f\t \t%-5.2f",
                         rate * 100, monthlyPayment, totalPayment);
       System.out.println();
       rate += increment;
     }
   }
 }
