/** Exercise 5.40 Simulation: heads or tails
 *  Write a program that simulates flipping a coin one million times and displays
 *  the number of heads and tails.
 */

public class HeadsTails {
  public static void main(String[] args) {

    int tails = 0;
    int heads = 0;

    // Calculate and output the result
    for (int i = 0; i < 1000000; i++) {
      int n = (int)(Math.random() * 2);
      if (n == 0)
        heads++;
      else
        tails++;
    }
    System.out.println("The number of heads is: " + heads +
                       "\nThe number of tails is: " + tails);
  }
}
