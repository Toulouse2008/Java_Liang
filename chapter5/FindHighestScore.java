/** Exercise 5.8 Find the highest score
 *  Write a program that prompts the user to enter the number of students and
 *  each student's name and score, an finally display the name of the student
 *  with highest score.
 */

 import java.util.Scanner;

 public class FindHighestScore {
   public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     int number = 0;
     String name = "";
     int score = 0;
     int highest = 0;
     String highestName = "";

     System.out.println("Enter the nubmer of students:");
     number = input.nextInt();
     for (int i = 0; i < number; i++) {
       System.out.println("Enter the score:");
       score = input.nextInt();
       input.nextLine();
       System.out.println("Enter the student name:");
       name = input.nextLine();
       if (score > highest) {
         highest = score;
         highestName = name;
       }
     }
     System.out.printf("The name is %s and the highest score is %s.\n", highestName,highest);
   }
 }
