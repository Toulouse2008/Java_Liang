/** Exercise 4.23 Financial application: payroll
 *  Write a program that reads the following information and prints a payroll
 *  statement.
 */

 import java.util.Scanner;

 public class Payroll {
   public static void main(String[] args) {

     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Employee's name:");
     String name = input.nextLine();
     System.out.println("Number of hours worked in a week:");
     double hours = input.nextDouble();
     System.out.println("Hourly pay rate:");
     double payRate = input.nextDouble();
     System.out.println("Federal tax withholding rate:");
     double federalTaxRate = input.nextDouble();
     System.out.println("State tax withholding rate:");
     double stateTaxRate = input.nextDouble();

     // Calculate and output results
     double grossPay = hours * payRate;
     double federalWithHolding = grossPay * federalTaxRate;
     double stateWithHolding = grossPay * stateTaxRate;
     double totalDeduction = federalWithHolding + stateWithHolding;
     double netPay = grossPay - totalDeduction;

     System.out.println("Employee Name: " + name);
     System.out.println("Hours Worked: " + hours);
     System.out.println("Pay Rate: $" + payRate);
     System.out.println("Gross Pay: $" + grossPay);
     System.out.println("Deductions:\n");
     System.out.println("  Federal Withholding (" + federalTaxRate * 100 +
            "%%): $" + federalWithHolding);
     System.out.println("  State Withholding (" + stateTaxRate * 100 +
            "%%): $" + stateWithHolding);
     System.out.println("  Total Deduction: $" + totalDeduction);
     System.out.println("  Net Pay: $" + netPay);
   }
 }
