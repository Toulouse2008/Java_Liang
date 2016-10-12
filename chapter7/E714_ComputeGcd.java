/** Exercise 7.14 Computing gcd
 *  Write a method that returns the gcd of an unspecified number of integers.
 *  The method header is:
 *  public static int gcd(int...numbers)
 *  Write a test program that prompts the user to enter five numbers, invokes
 *  the method to find the gcd, and displays it.
 */

import java.util.Scanner;

public class E714_ComputeGcd {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 5 integers: ");
    int[] array = new int[5];
    for (int i = 0; i < 5; i++) {
      array[i] = input.nextInt();
    }

    System.out.println("The gcd is " +
               gcd(array[0], array[1], array[2], array[3], array[4]));

  }
  // Define the gcd method
  public static int gcd(int...numbers) {
    int min = findSmallest(numbers);
    int gcdCurrent = 1;
    boolean isOk = true;
    for (int divisor = 2; divisor <= min; divisor++) {
      for(int i = 0; i < numbers.length; i++) {
        if(numbers[i] % divisor != 0){
          isOk = false;
        }
        break;
      }
      if (isOk)
        gcdCurrent = divisor;
    }
    return gcdCurrent;
  }

  // Define the findSmallest method
  public static int findSmallest(int[] array) {
    int smallest = array[0];
    for (int i = 1; i < array.length; i++) {
      if (smallest > array[i])
        smallest = array[i];
    }
    return smallest;
  }
}
