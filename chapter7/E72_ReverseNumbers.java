/** Exercise 7.2 Reverse the numbers entered
 *  Write a program that reads 10 integers and displays them in the
 *  reverse of the order in which they were read.
 */

import java.util.Scanner;

public class E72_ReverseNumbers {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 integers: ");
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = input.nextInt();
    }

    // Ourput the numbers in reverse order
    for (int i = numbers.length - 1; i >= 0; i--) {
      System.out.print(numbers[i] + " ");
    }

    // Extra line
    System.out.println();
  }
}
