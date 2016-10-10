/** Listing 6.7 Prime Number Method  */

public class ListingPrimeNumberMethod {
  public static void main(String[] args) {

    System.out.println("The first 50 prime numbers are \n");
    printPrimeNumber(50);
  }

  public static void printPrimeNumber(int numberOfPrimes) {
    final int NUMBER_OF_PRIMES_PER_LINE = 10;
    int count = 10;
    int number = 2;

    // Repeatedly find prime numbers
    while (count < numberOfPrimes) {
      // Print the prime number and increase the count
      if (isPrime(number)) {
        count++; // Increase the count
        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          // Print the number and advance to the new line
          System.out.printf("%-5s\n", number);
        }
        else
          System.out.printf("%-5s", number);
      }

      // Check whether the next number is prime
      number++;
    }
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
