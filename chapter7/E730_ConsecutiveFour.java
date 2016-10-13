/** Exercise 7.30 Pattern recognition: consecutive four equal
 *  numbers
 *  Write the following method that tests whether the array has
 *  four consecutive numbers with the same value.
 *  public static boolean isConsecutiveFour(int[] values)
 *  Write a test program that prompts the user to enter a series
 *  of integers and displays if so.
 *  Prompt the user to enter the input size first.
 */

import java.util.Scanner;

public class E730_ConsecutiveFour {
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

    // Invoke the isConsecutiveFour method
    boolean isConsecutive = isConsecutiveFour(array);
    if (isConsecutive)
      System.out.println("The list has consecutive fours");
    else
      System.out.println("The list has no consecutive fours");
  }

  /** Define isConsecutiveFour method */
  public static boolean isConsecutiveFour(int[] values) {

    boolean haveFour = false;
    for (int i = 0; i < values.length - 3; i++) {
      for (int j = i; j < values.length - 3; j++) {
        int temp = values[i];
        if(temp == values[j] && temp == values[j+1] &&
           temp == values[j+2] && temp == values[j + 3])
          haveFour = true;
      }
    }
    return haveFour;
  }

}
