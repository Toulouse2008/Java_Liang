/** Exercise 5.26 Compute e
 *  Write a program to compute approximate e using the following series:
 *  e = 1 + 1/1! + 1/2! +1/3! +... + 1/n!
 */
public class ComputeE {
  public static void main(String[] args){

    // Increment of item numbers
    int n = 10000;
    while (n <= 100000) {
      double sum = 0;
      double item = 1;
      // calculate item i and the sum to item i
      for (int i = 1; i <= n; i++) {
        item *= 1.0/i;
        sum += item;
      }
      // Add 1 to sum gives e and output it
      sum += 1;
      System.out.println(n + " of items e is: " + sum);
      n += 10000;
    }

  }
}
