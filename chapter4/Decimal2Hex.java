/** Exercise 4.11 Decimal to hex
 *  Write a program that prompts the user to enter an integer between 0 and 15
 *  and displays its corresponding hex number.
 */

 import java.util.Scanner;

 public class Decimal2Hex {
   public static void main(String[] args) {

     // Get the input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a decimal value (0 to 15):");
     int number = input.nextInt();

     if (number > 15 || number < 0)
       System.out.println(number + " is an invalid input");
     else if (number < 10)
       System.out.println("The hex value is " + number);
     else {
       char hexValue = (char)('A' - 10 + number);
       System.out.println("The hex value is " + hexValue);
     }
   }
 }
