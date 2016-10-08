/** Exercise 5.18 Display four patterns using loops
 *  Use nested loops that display the following
 *  patterns in four separate programs.
 */

import java.util.Scanner;

public class FourPatterns {
  public static void main(String[] args){

    // Get the input from the user
    System.out.println("Enter the number of lines(Smaller than 20):");
    Scanner input = new Scanner(System.in);
    int numberOfLine = input.nextInt();

    System.out.println("Pattern A:");
    patternA(numberOfLine);

    System.out.println("Pattern B: ");
    patternB(numberOfLine);

    System.out.println("Pattern C: ");
    patternC(numberOfLine);

    System.out.println("Pattern D: ");
    patternD(numberOfLine);

    System.out.println("Pattern E: ");
    patternE(numberOfLine);

   }

  // Diaplay Pattern A
  public static void patternA(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");  // print numbers separated by space
      }
      System.out.println();  // Control line
    }
  }

  // Display Pattern B
  public static void patternB(int n) {
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");  // print numbers that is one less than previous line
      }
      System.out.println();  // control lines
    }
  }

  // Display Pattern C
  public static void patternC(int n) {
    for (int i = 1; i <= n; i++) {
      for (int k = n-i; k > 0; k--) {
        System.out.print("  ");         // Add space in the front of each line
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");    // print numbers in reverse order
      }
      System.out.println();  // Control lines
    }
  }

  // Display Pattern D
  public static void patternD(int n) {
    for(int i = 1; i <= n; i++) {
      for (int j = i - 1; j > 0; j--) {
        System.out.print("  ");         // Add space int the front of each line
      }
      for (int k = 1; k <= n - i + 1; k++) {
        System.out.print(k + " ");     // Print numbers separated by one space
      }
      System.out.println();    // Control lines
    }
  }

  // Display Pattern E
  public static void patternE(int n) {
    for (int i = n; i >= 1; i--) {
      System.out.print(" ");         // Add space in the front of each line
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");   // Print numbers separated by one space
      }
      System.out.println();     // Control lines
    }
  }

 }
