/** Exercise 6.13 Sum series
 *  Write a method to compute the following series:
 *  m(i) = 1/2 + 2/3 +3/4 + ... + i/i+1.
 *  Write a test program that displays the results table.
 */

public class E613_SumSeries {
  public static void main(String[] args) {

    // Invoke the method and output the results
    System.out.print("i  \t m(i)\n");
    for (int i = 1; i <= 20; i++) {
      System.out.printf("%-2d\t%5.4f\n", i, sumSeries(i));
    }

  }

  /** Define the sumSeries method  */
  public static double sumSeries(int n) {
    double sum = 0;
    for(int i = 1; i <= n; i++) {
      sum += i * 1.0 / (i + 1);
    }
    return sum;
  }
}
