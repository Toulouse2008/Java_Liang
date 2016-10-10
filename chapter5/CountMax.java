/** Exercise 5.41 Occurrence of max numbers
 *  Write a program that reads integers, finds the largest of them, and counts
 *  its occurrences. Input ends with 0.
 */

import java.util.Scanner;

public class CountMax {
  public static void main(String[] args) {

    int max = 1;
    int count = 0;

    // Get the inputs from the user
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    // Continuously read integers until meeting a 0 and count and displays max
    while (number != 0) {
      if (max < number) {
        max = number;
        count = 1;
      }
      else if (max == number) {
        count += 1;
      }
      number = input.nextInt();
    }
    System.out.println("The max number is " + max +
           "\nThe occurrence count of the max is " + count);
  }
}
