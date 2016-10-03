/** Exercise 3.31 Financial: currency exchange
 *  Write a program that prompts the user to enter the exchange rate
 *  from currency in US dollars to Chinese RMB. Prompt the user to
 *  enter 0 to convert from dollars to RMB and 1 to convert from RMB
 *  to dollars. Prompt the user to enter the amount of money to convert.
 */
 import java.util.Scanner;

 public class CurrencyExchange {
   public static void main(String[] args) {
     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the exchange rate from dollars to RMB:");
     double rate = input.nextDouble();
     System.out.println("Enter 0 to convert dollars to RMB, otherwise 1:");
     int choice = input.nextInt();
     double RMB = 0;
     double dollars = 0;
     if (choice == 0) {
       System.out.println("Enter the dollar amount:");
       dollars = input.nextDouble();
       RMB = dollars * rate;
       System.out.println(dollars + " is " + RMB + " yuan.");
     }
     else {
       System.out.println("Enter the RMB amount:");
       RMB = input.nextDouble();
       dollars = RMB / rate;
       System.out.println(RMB + " is " + dollars + " dollars.");
     }
   }
 }
