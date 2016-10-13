/** Exercise 7.31 Merge two sorted lists
 *  Write the following method that merges two sorted lists into
 *  a new sorted list.
 *  public static int[] merge(int[] list1, int[] list2)
 *  Write a test program that prompts the user to enter two sorted
 *  lists and displays the merged list.
 */

 import java.util.Scanner;

 public class E731_MergeSortedArrays {
   public static void main(String[] args) {


     // Get the input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the length of list1:");
     int size1 = input.nextInt();
     System.out.println("Enter the length of list2:");
     int size2 = input.nextInt();

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

     // Invoke the merge method
     int[] merged = new int[size1 + size2];
     merged = merge(list1, list2);
     int count = 0;
     for (int i = 0; i < size1 + size2; i++) {
       System.out.printf("%5d \t", merged[i]);
       count++;
       if (count % 6 == 0)
         System.out.println();
     }
     System.out.println();
  }

  /** Define the merge method */
  public static int[] merge(int[] list1, int[] list2) {
    int size = list1.length + list2.length;
    int[] mergedList = new int[size];
    int j = 0;
    int k = 0;
    int i = 0;
    boolean nondescending = isNondescending(list1);
    if (nondescending){
      for (i = 0; i < size; i++) {
        if (j < list1.length && k < list2.length) {
          if (list1[j] <= list2[k]) {
            mergedList[i] = list1[j];
            j++;
          }
          else {
            mergedList[i] = list2[k];
            k++;
          }
        }
        else if (j == list1.length) {
          mergedList[i] = list2[k];
          k++;
        }
        else {
          mergedList[i] = list1[j];
          j++;
        }
      }
    }
    else {
      for (i = 0; i < size; i++) {
        if (j < list1.length && k < list2.length) {
          if (list1[j] >= list2[k]) {
            mergedList[i] = list1[j];
            j++;
          }
          else {
            mergedList[i] = list2[k];
            k++;
          }
        }
        else if (j == list1.length) {
          mergedList[i] = list2[k];
          k++;
        }
        else {
          mergedList[i] = list1[j];
          j++;
        }
      }
    }
    return mergedList;
  }

  // Define isNodescending methoc
  public static boolean isNondescending(int[] list) {
    boolean nondescending = false;
    if (list[0] <= list[list.length - 1])
      nondescending = true;
    return nondescending;
  }
}
