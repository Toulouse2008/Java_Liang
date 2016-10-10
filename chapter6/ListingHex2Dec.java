/** Listing 6.8 Hex to Decimal */

import java.util.Scanner;

public class ListingHex2Dec {
  public static void main(String[] args) {

    // Get the Hex from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the hex number: ");
    String hexValue = input.nextLine();

    System.out.println("The decimal value for hex number is " +
           hexValue + " is " + hex2Dec(hexValue.toUpperCase()));
  }

  // Define method that converts hex to decimal
  public static int hex2Dec(String hex) {
    int decimalValue = 0;
    for(int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      decimalValue = decimalValue * 16 + hexChar2Dec(hexChar);
    }
    return decimalValue;
  }

  public static int hexChar2Dec (char ch) {
    if (ch >= 'A' && ch <= 'F')
      return 10 + ch - 'A';
    else
      return ch - '0';
  }
}
