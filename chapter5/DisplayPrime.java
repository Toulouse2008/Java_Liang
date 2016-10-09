/** Exercise 5.20 Display prime numbers between 2 and 1000
 *  Modify Listing 5.15 to display all the prime numbers between 2 and 1000,
 *  inclusive. Display eight prime numbers per line. Numbers are separated by
 *  by exact one space
 */

public class DisplayPrime {
  public static void main(String[] args) {

    int count = 0;

    for (int i = 2; i <= 1000; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i / 2; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        count++;
        if (i < 10)
          System.out.print(i + "   ");
        else if (i < 100)
          System.out.print(i + "  ");
        else
          System.out.print(i + " ");
        if (count % 10 == 0)
          System.out.println();
      }
    }
    System.out.println();


    }
  }
