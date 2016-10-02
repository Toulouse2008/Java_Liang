/**Listing 2.10 Compute change */

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double: ");
        double amount = input.nextDouble();
        //calculate dollars
        int RemainingAmount = (int)(amount * 100);
        int NumberOfOneDollars = RemainingAmount / 100;
        RemainingAmount = RemainingAmount % 100;
        int NumberOfQuarters = RemainingAmount / 25;
        RemainingAmount = RemainingAmount % 25;
        int NumberOfDimes = RemainingAmount / 10;
        RemainingAmount = RemainingAmount % 10;
        int NumberOfNickels = RemainingAmount / 5;
        int NumberOfPennies = RemainingAmount;
        //Display results
        System.out.println("Your amount" + amount + " consists of ");
        System.out.println(NumberOfOneDollars + " dollars ");
        System.out.println(NumberOfQuarters + " quarters ");
        System.out.println(NumberOfDimes + " dimes ");
        System.out.println(NumberOfNickels + " nickels ");
        System.out.println(NumberOfPennies + " pennies.");
   }
}
