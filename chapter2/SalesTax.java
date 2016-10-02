/** Listing 2.8 Sales tax */

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double PurchaseAmount = input.nextDouble();
        double tax = PurchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100);
    }
}
