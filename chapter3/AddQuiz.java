/** Exercise 3.10 Addition Quiz
 *  Randomly generate an addtion question with two integers
 *  less than 100.
 */

import java.util.Scanner;

public class AddQuiz {
  public static void main(String[] args) {

    int number1 = (int)(Math.random() * 100);
    int number2 = (int)(Math.random() * 100);

    System.out.println("What is " + number1 + " + " + number2 + "?");
    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();

    if(number1 + number2 == answer)
      System.out.println("You are correct!");
    else{
      System.out.println("You answer is wrong.");
      System.out.println(number1 + " + " + number2 + " should be " +
             (number1 + number2));
    }
  }
}
