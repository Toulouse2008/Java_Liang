/** Exercise 7.7 count single digits
 *  Write a program that generates 100 random integers between 0 and 9 and displays
 *  the count for each number (0s, 1s, 2s,...,9s).
 */

public class E77_CountSingleDigits {
  public static void main(String[] args) {

    int[] counts = new int[10];
    int number = (int)(Math.random() * 10);
    for(int i = 0; i < 100; i++) {
      counts[number] += 1;
      number = (int)(Math.random() * 10);
    }

    // Output the result
    for (int i = 0; i < 10; i++) {
      System.out.println("The counts for " + i + " is " + counts[i]);
    }

  }
}
