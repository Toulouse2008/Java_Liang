/** Exercise 3.7 Monetary Units
 *  Using singular words for single units.
 */

import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double: ");
        double amount = input.nextDouble();

        //calculate dollars, quarters, dimes, nickels, pennies
        int remainingAmount = (int)(amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        int numberOfPennies = remainingAmount;
        
        //Display results
        System.out.println("Your amount" + amount + " consists of ");
        if (numberOfOneDollars > 1)
          System.out.println(numberOfOneDollars + " dollars ");
        else
          System.out.println(numberOfOneDollars + " dollar ");
        if (numberOfQuarters > 1)
          System.out.println(numberOfQuarters + " quarters ");
        else
          System.out.println(numberOfQuarters + " quarter ");
        if (numberOfDimes > 1)
          System.out.println(numberOfDimes + " dimes ");
        else
          System.out.println(numberOfDimes + " dime ");
        if (numberOfNickels > 1)
          System.out.println(numberOfNickels + " nickels ");
        else
          System.out.println(numberOfNickels + " nickel ");
        if (numberOfPennies > 1)
          System.out.println(numberOfPennies + " pennies.");
        else
          System.out.println(numberOfPennies + " pennie.");
   }
}
