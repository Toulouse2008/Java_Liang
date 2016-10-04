/** Exercise 4.12 Hex to binary
 *  Write a program that prompts the user to enter a hex digit and displays its
 *  corresponding binary number.
 */

 import java.util.Scanner;

 public class Hex2Binary {
   public static void main(String[] args) {

     // Get the input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a hex digit:");
     String s = input.nextLine();
     char ch = s.charAt(0);

     int num = 0;

     // Calculate and output result
     if (ch >= 'A' && ch <= 'F') {
       num = 9 + ch - 'A';
       System.out.println(Integer.toBinaryString(num));
     }
     else if (ch >= '0' && ch <= '9') {
       num = ch - '0';
       System.out.println(Integer.toBinaryString(num));
     }
     else {
       System.out.println("Input is invalid");
       System.exit(1);
     }
   }
 }
