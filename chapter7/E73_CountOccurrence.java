/** Exercise 7.3 Count occurrence of numbers
 *  Write a program that reads the integers between 1 and 100, and
 *  count the occurrences of each. Assume the input ends with 0.
 */

import java.util.Scanner;

public class E73_CountOccurrence {
  public static void main(String[] args) {

    int[] numbers = new int[101];

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter numbers(0 to terminate): ");
    int number = input.nextInt();
    while(number != 0) {
      numbers[number] += 1;
      number = input.nextInt();
    }

    // Output result
    for (int i = 1; i < 101; i++) {
      if (numbers[i] != 0) {
        if(numbers[i] > 1)
          System.out.println(i + " occurs " + numbers[i] + " times");
        else
          System.out.println(i + " occurs 1 time");
      }
    }

  }
}
