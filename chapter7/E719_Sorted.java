/** Exercise 7.19 Sorted?  */

import java.util.Scanner;

public class E719_Sorted {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 integers: ");
    int[] array = new int[10];
    for (int i = 0; i < 10; i++) {
      array[i] = input.nextInt();
    }

    boolean sort = isSorted(array);
    System.out.println("The array is " + (sort? " Sorted" : "Unsorted"));
  }

  // Define isSorted
  public static boolean isSorted(int[] list) {

    boolean sorted = false;
    // check if increasingly ordered
    if(list[0] <= list[1])
      sorted = true;
    for (int i= 1; i < list.length - 1; i++) {
      if (list[i] <= list[i+1])
        continue;
      else {
        sorted = false;
        break;
      }
    }
    if (sorted)
      return true;

    // Check if decreasing orderd
    if(list[0] >= list[1])
      sorted = true;
    for (int i= 1; i < list.length - 1; i++) {
      if (list[i] >= list[i+1])
        continue;
      else {
        sorted = false;
        break;
      }
    }
    if (sorted)
      return true;
    else
      return false;

  }

}
