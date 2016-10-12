/** Exercise 7.16 Execution time
 *  Write a program that randomly generates an array of 100,000 integers
 *  and a key. Estimate the execution time with linearSearch and binarySearch.
 *  with System.currentTimeMillis().
 */

public class E716_ExecutionTime {
  public static void main(String[] args) {

    // Generate an array of 100,000 integers and a key
    int[] array = new int[100000];
    for (int i = 0; i < 100000; i++) {
      array[i] = (int)(Math.random() * 100000);
    }
    int key = (int)(Math.random() * 100000);
    long startA = System.currentTimeMillis();
    int indexFound = linearSearch(array, key);
    long endA = System.currentTimeMillis();
    long time1 = endA - startA;
    System.out.println(indexFound + " found by linear search in " + time1);

    long startB = System.currentTimeMillis();
    selectionSort(array);
    indexFound = binarySearch(array, key);
    long endB = System.currentTimeMillis();
    long time2 = endB - startB;
    System.out.println(indexFound + " found by linear search in " + time2);
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

  /** Define selectionSort method */
  public static void selectionSort(int[] list) {
    for (int i = 0; i < list.length -1; i++) {
      int currentMin = list[i];
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
