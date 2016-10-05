/** Listing 5.3 Guess number    */

import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {

    // Generate random number from 0 to 100 inclusive
    int number = (int)(Math.random() * 101);

    // Get the first guess from the user
    Scanner input = new Scanner(System.in);
    int guess = -1;
    System.out.println("Guess a magic number between 0 and 100:");

    while(guess != number) {
      System.out.println("Enter your guess");
      guess = input.nextInt();
      if (guess > number)
        System.out.println("Your guess is too high");
      else if (guess < number)
        System.out.println("Your guess is too low");
      else
        System.out.println("Yes, the number is " + number);
    }

  }
}
