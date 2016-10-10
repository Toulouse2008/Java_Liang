/** Exercise 6.14 Estimate Pi
 *  Pi can be computed using the following series:
 *  m(i) = 4*(1-1/3+1/5-1/7+...+(-1)^(i+1)/2i-1)
 *  Write a method that returns m(i) for a given i and Write
 *  a test program that displays the pi from 1 to 901 as i with
 *  increment of 100.
 */

public class E614_EstimatePi {
  public static void main(String[] args) {

    for (int i = 1; i <= 901; i = i + 100) {
      System.out.printf("%-3d\t\t%5.4f\n", i, estimatePi(i));
    }
  }

  // Define method that estimates Pi
  public static double estimatePi(int n) {
    double sum = 0;
    for(int i = 1; i <= n; i++) {
      sum += Math.pow((-1.0), (i+1)) / (2.0 * i - 1);
    }
    return sum * 4.0;
  }
}
