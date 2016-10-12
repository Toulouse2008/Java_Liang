/** Listing 7.8 Selection sort  */

public class Listing78_SelectionSort {
  public static void main(String[] args) {

    double[] list = {9, 10, 20, 1, 2, 3, 4, 6, 8, 0.2};
    selectionSort(list);
    for (int i = 0; i < list.length -1; i++)
      System.out.print(list[i] + " ");
  }

  /** Define selectionSort method */
  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length -1; i++) {
      double currentMin = list[i];
      int currentMinIndex = i;
      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]){
          currentMin = list[j];
          currentMinIndex = j;
        }
      }
      // Swap list[i] with list[currentMinIndex] if necessary
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
}
