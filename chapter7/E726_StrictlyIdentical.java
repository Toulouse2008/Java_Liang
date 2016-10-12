/** Exercise 7.26 Strictly identical arrays
 *  The array list1 and list2 are strictly identical if their
 *  corresponding elements are equal. Write a method that returns true
 *  if so.
 *  public static boolean equals(int[] list1, int[] list2)
 *  Write a test program that prompts the user to enter two lists of
 *  integers and displays whether the two are strictly identical.
 */

import java.util.Scanner;

public class E726_StrictlyIdentical {
  public static void main(String[] args) {


    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of list1:");
    int size1 = input.nextInt();
    System.out.println("Enter the length of list2:");
    int size2 = input.nextInt();
    if (size1 != size2) {
      System.out.println("Two lists are not strictly identical");
      System.exit(0);
    }
    int[] list1 = new int[size1];
    int[] list2 = new int[size2];
    System.out.println("Enter list1: ");
    for (int i = 0; i < size1; i++) {
      list1[i] = input.nextInt();
    }
    System.out.println("Enter list2: ");
    for (int i = 0; i < size2; i++) {
      list2[i] = input.nextInt();
    }

    // Invoke the equals method
    boolean isEqual = equals(list1, list2);
    if (isEqual)
      System.out.println("Two lists are strictly identical");
    else
      System.out.println("Two lists are not strictly identical");
  }

  // Define equals method
  public static boolean equals(int[] list1, int[] list2) {
    boolean isEqual = true;
    if (list1.length != list2.length)
      isEqual = false;
    else {
      for (int i = 0; i < list1.length; i++)
        if(list1[i] != list2[i]) {
          isEqual = false;
          break;
        }
    }
    return isEqual;
  }
}
