/** Exercise 7.5 Print distinct numbers
 *  Write a program that reads in ten numbers and displays the number of distinct
 *  numbers and the distinct numbers separated by exact one space(i.e, if a number
 *  appears multiple times, it is displayed only onece.)
 */

import java.util.Scanner;

public class E75_DistinctNumbers {
  public static void main(String[] args) {

    int[] numbers = new int[10];

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    for (int i = 0; i < 10; i++) {
      numbers[i] = number;
      number = input.nextInt();
    }

    int[] distinctNumbers = new int[10];
    boolean distinct = true;
    int count = 0;
    for (int i = 0; i < 9; i++) {
      for (int j = i + 1; j < 10; j++) {
        if (numbers[i] == numbers[j]){
          distinct = false;
          break;
        }
      }
      if (distinct == true){
        distinctNumbers[count] = numbers[i];
        count++;
      }
    }

    // Output the result
    System.out.println("The number of distinct number is :" + count);
    System.out.print("The distinct number is ");
    for (int i = 0; i < count; i++) {
      System.out.print(distinctNumbers[i] + " ");
    }
    System.out.println();
    
  }
}
