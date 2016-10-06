/** Exercise 5.2 Repeat additions
 *  Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction
 *  questions. Revie the program to generate ten random addition questions for
 *  two integers between 1 to 15. Display the correct count and time.
 */

 import java.util.Scanner;

 public class RepeatAddition {
   public static void main(String[] args) {
     final int NUMBER_OF_QUESTIONS = 10;
     int correctCount = 0;
     int count = 0;
     long startTime = System.currentTimeMillis();
     String output =" ";
     Scanner input = new Scanner(System.in);

     while (count < NUMBER_OF_QUESTIONS) {
       // Generate two random single digit integers
       int number1 = (int)(Math.random() * 16);
       int number2 = (int)(Math.random() * 16);

       // Prompt the user to enter the answer
       System.out.println("What is " + number1 + " + " +
              number2 + "?: ");
       int answer = input.nextInt();

       // Grade the answer and display the result
       if(number1 + number2 == answer){
         System.out.println("You are correct!");
         correctCount++;
       }
       else
         System.out.println("Your answer is wrong.\n" +
                "The answer is " + (number1 + number2));
       count++;

       output += "\n" + number1 + "+" + number2 + "=" +
                ((number1 + number2 == answer) ? " correct" : " wrong");
     }
     long endTime = System.currentTimeMillis();
     long testTime = endTime - startTime;
     System.out.println("Correct count is " + correctCount + "\nTest time is " +
            testTime / 1000 + " seconds\n" + output);
   }
 }
