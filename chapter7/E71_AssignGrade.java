/** Exercise 7.1 Assign grades
 *  Write a program that reads student scores, get the best score, and
 *  then assigns grades based on the following scheme:
 *  Grade is A if score >= best -10; B if score >= best -20...D if
 *  score >= best - 40, otherwise F.
 */

 import java.util.Scanner;

 public class E71_AssignGrade {
   public static void main(String[] args) {

     // Get the input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the number of student: ");
     int size = input.nextInt();
     double[] scores = new double[size];
     for (int i = 0; i < size; i++) {
       scores[i] = input.nextDouble();
     }

     // Find max
     double max = scores[0];
     for (int i = 1; i < size; i++) {
       if (max < scores[i]) {
         max = scores[i];
       }
     }
     // calculate the grades and output result
     for (int i = 0; i < size; i++) {
       if (scores[i] >+ max - 10) {
         System.out.println("Student " + i + " score is " + scores[i] +
                " and grade is " + "A");
       }
       else if (scores[i] >= max - 20) {
         System.out.println("Student " + i + " score is " + scores[i] +
                " and grade is " + "B");
       }
       else if (scores[i] >= max - 30) {
         System.out.println("Student " + i + " score is " + scores[i] +
                " and grade is " + "C");
       }
       else if (scores[i] >= max - 40) {
         System.out.println("Student " + i + " score is " + scores[i] +
                " and grade is " + "D");
       }
       else
         System.out.println("Student " + i + " score is " + scores[i] +
                " and grade is " + "F");
     }
   }
 }
