/** 2.6 Sum the digits in an integer */

import java.util.Scanner;

public class SumDigit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sum = 0, remainder =0;
        while(number != 0){
            remainder = number % 10;
            sum += remainder;
            number /=10;
        }
        System.out.println("The sum of the digit is " + sum);
    }
}
