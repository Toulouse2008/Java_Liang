/** Listing 5.11 Decimal to hex number */

import java.util.Scanner;

public class Dec2Hex {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a decimal number: ");
    int decimal = input.nextInt();

    // Convert decimal to hex
    String hex = "";

    while (decimal != 0) {
      int hexValue = decimal % 16;
      char hexDigit = (hexValue <=9 && hexValue >= 0) ?
                     (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
      hex = hexDigit + hex;
      decimal = decimal / 16;
    }
    // Output result
    System.out.printf("The hex number is " + hex + "\n");
  }
}
