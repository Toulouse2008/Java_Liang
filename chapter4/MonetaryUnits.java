/** Exercise 4.26 Fiancial application: monetary units
 *  Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of
 *  accuracy when converting a float value to an int value. Read the input as a
 *  string. Your program shoud extract the doallar amount before the decimal point
 *  and the cents after the decimal amount using the indexOf and substring methods.
 */

import java.util.Scanner;

public class MonetaryUnits {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount: ");
    String amount = input.nextLine();

    // Extract dollars and cents
    int indexOfPoint = 0;
    if (amount.contains(".")) {
      indexOfPoint = amount.indexOf(".");
      String dollars = amount.substring(0, indexOfPoint);
      String cents = amount.substring(indexOfPoint + 1, indexOfPoint + 3);

      // Calculate quarters, dimes, nickels and pennies
      int intCents = Integer.parseInt(cents);
      int NumberOfQuarters = intCents / 25;
      int RemainingAmount = intCents % 25;
      int NumberOfDimes = RemainingAmount / 10;
      RemainingAmount = RemainingAmount % 10;
      int NumberOfNickels = RemainingAmount / 5;
      int NumberOfPennies = RemainingAmount;

      //Display results
      System.out.println("Your amount" + amount + " consists of ");
      System.out.println(dollars + " dollars ");
      System.out.println(NumberOfQuarters + " quarters ");
      System.out.println(NumberOfDimes + " dimes ");
      System.out.println(NumberOfNickels + " nickels ");
      System.out.println(NumberOfPennies + " pennies.");
    }
    else
      System.out.println("Your amount " + amount + " consists of " + amount +
             "dollars");
  }
}
