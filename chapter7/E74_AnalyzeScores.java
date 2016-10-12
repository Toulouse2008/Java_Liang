/** Exercise 7.4 Analyze scores
 *  Write a program that reads an unspecified number of scores and
 *  determines how many scores are above or equal to the average and
 *  how many scores are below the average. Enter a negative number to
 *  signify the end of input. Assume the maximum number of scores is
 *  100.
 */

import java.util.Scanner;

public class E74_AnalyzeScores {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the scores(a negative number terminates input): ");
    int[] scores = new int[101];
    int score = input.nextInt();
    while (score >= 0) {
      scores[score] += 1;
      score = input.nextInt();
    }

    // calculate the average
    int count = 0;
    double sum = 0;
    for (int i = 1; i < 101; i++) {
      if (scores[i] != 0) {
        sum += i * scores[i];
        count += scores[i];
      }
    }
    double average = sum /count;

    // Get the result
    int above = 0;
    int below = 0;
    for (int i = 1; i < 101; i++) {
      if (scores[i] != 0 && i >= average)
        above += scores[i];
      else if (scores[i] != 0 && i < average)
        below += scores[i];
    }

    // Output result
    System.out.println("The avarage is: " + average);
    System.out.println("Above average is: " + above);
    System.out.println("Below average is: " + below);
  }
}
