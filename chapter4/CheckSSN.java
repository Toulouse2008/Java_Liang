/** Exercise 4.21 Check SSN
 *  Write a program that prompts the user to enter a Social Security number in
 *  the format of DDD-DD-DDDD, where D is a digit. Check and display whether the
 *  input is a valid SSN.
 */

 // This code is buggy. Redo the checking conditions

import java.util.Scanner;

public class CheckSSN {
  public static void main(String[] args) {

    // Get input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a SSN:");
    String ssn = input.nextLine();

    // Disect the input
    String str1 = ssn.substring(0, 3);
    String str2 = ssn.substring(4, 6);
    String str3 = ssn.substring(7);

    // Check if valid and output
    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);
    int num3 = Integer.parseInt(str3);
    if (Integer.toString(num1) == str1 &&
        Integer.toString(num2) == str2 &&
        Integer.toString(num3) == str3)
      System.out.println(ssn + " is a valid social security number");
    else
      System.out.println(ssn + " is an invalid social security number");
  }
}
