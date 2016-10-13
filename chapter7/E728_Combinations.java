/** Exercise 7.28 Math: combinations
 *  Write a program that prompts the user to enter 10 integers
 *  and displays all combinations of picking two numbers from
 *  the 10.
 */

import java.util.Scanner;

public class E728_Combinations {
  public static void main(String[] args) {

    // Get the input form the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of integers: ");
    int size = input.nextInt();
    System.out.println("Enter the integers: ");
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = input.nextInt();
    }

    // Output combinations of two
    System.out.println("The combinations are listed here:");
    int count = 0;
    for (int i = 0; i < size; i++) {
      for (int j = 1; j < size - 1; j++) {
        System.out.printf("%d and %d\t", array[i], array[j]);
        count++;

        // Line control
        if (count % 2 == 0)
          System.out.println();
      }
    }

  }
}
