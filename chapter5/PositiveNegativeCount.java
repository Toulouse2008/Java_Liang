/** Exercise 5.1 Count positive and negative numbers and compute the avarage of
 *  the numbers
 *  Write a program that reads an unspecified number of integers, determines how
 *  many positive and negative values have been read, and computes the total and
 *  average of the input values (not counting zeros). Your program ends with the
 *  input 0. Display the average as a floating- point number.
 */

 import java.util.Scanner;

 public class PositiveNegativeCount {
   public static void main(String[] args) {

     int negativeCount = 0;
     int positiveCount = 0;
     int negativeSum = 0;
     int positiveSum = 0;

     Scanner input = new Scanner(System.in);
     System.out.println("Enter the integer, 0 to quit:");
     int number = input.nextInt();

     while (number != 0){
       if (number > 0) {
         negativeCount++;
         negativeSum += number;
       }
       else {
         positiveCount++;
         positiveSum += number;
       }
       System.out.println("Enter the integer, 0 to quit:");
       number = input.nextInt();
     }
     int total = negativeSum + positiveSum;
     int totalCount = negativeCount + positiveCount;
     float average = total / totalCount;
     System.out.println("The number of positives is " + positiveCount +
            ".\nThe number of negatives is " + negativeCount +
            ".\nThe total is " + total + ".\nThe average is  " + average +
            ".\n");
   }
 }
