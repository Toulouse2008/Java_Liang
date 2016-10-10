/** E6.10 Use the isPrime methods
 *  Use isPrime method in Listing6.7 to find the number of
 *  prime numbers less than 10000.
 */

public class E610_isPrime {
  public static void main(String[] args) {

    int count = 0;
    for (int i = 2; i < 10000; i++) {
      if (isPrime(i)) {
        count++;
        if (count % 10 == 0 && count != 0)
          System.out.printf("%5d \n", i);
        else
          System.out.printf("%5d ", i);
      }
    }
    System.out.println("\nTotal primes are " + count);
  }

  /** Check whether number is prime */
  public static boolean isPrime(int number) {
    for (int divisor = 2; divisor <= number / 2; divisor++) {
      if (number % divisor ==0) { // If true, number is not prime
        return false;  // Number is not prime
      }
    }

    return true;  // Number is prime
  }
}
