/** Listing 7.6 / 7.7 Linear search / binary search  */

import java.util.Scanner;

public class Listing76_TestSearch {
  public static void main(String[] args) {

    int[] list = {2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16};

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the search key: ");
    int key = input.nextInt();

    System.out.println("Linear: " + linearSearch(list, key));
    System.out.println("Binary: " + binarySearch(list, key));
  }

  /** Define LinearSearch */
  public static int linearSearch(int[] list, int key) {
    for(int i = 0; i < list.length; i++) {
      if (key == list[i])
        return i;
    }
    return -1;
  }

  /** Define binarySearch  */
  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (key < list[mid])
        high = mid - 1;
      else if (key == list[mid])
        return mid;
      else
        low = mid + 1;
    }
    return -low-1;
  }


}
