/** Listing 5.5 Sentinel value  */

import java.util.Scanner;

public class SentinelValue {
  public static void main(String[] args) {

    // Read an initial data
    System.out.println("Enter an integer(The input ends if it is 0):");
    Scanner input = new Scanner(System.in);
    int data = input.nextInt();

    // Keep reading data until the input is 0
    int sum = 0;
    while(data != 0) {
      sum += data;
      System.out.println("Enter an integer(0 to quit):");
      data = input.nextInt();
    }
    System.out.println("The sum is " + sum);
  }
}
