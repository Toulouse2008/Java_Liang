/** Exercise 7.18 Bubble search  */

import java.util.Scanner;

public class E718_BubbleSort {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 floating point numbers: ");
    double[] array = new double[10];
    for (int i = 0; i < 10; i++) {
      array[i] = input.nextDouble();
    }

    // bubble sort
    double temp = 0;
    for (int i= 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          temp =array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      System.out.print(array[i] + " ");
    }

  }
}
