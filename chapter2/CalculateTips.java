/** 2.5 Calculate tips */

import java.util.Scanner;

public class CalculateTips{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity percentage: ");
        double subtotal = input.nextDouble();
        double GratuityRate = input.nextDouble();
        double gratuity = subtotal * GratuityRate / 100;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity +
            "\n" + "The total is $" + total);
    }
} 
