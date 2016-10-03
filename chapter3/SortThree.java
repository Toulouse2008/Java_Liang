/** Exercise 3.8 Write a program that prompts the user to enter three integers
 *  and display the integers in non-decreasing order
 */
 import java.util.Scanner;

 public class SortThree {
   public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Enter three integers:");
     int a = input.nextInt();
     int b = input.nextInt();
     int c = input.nextInt();

     if (a >= b && a >= c) {
       if (b >= c)
         System.out.println(a + " " + b + " " + c + ".");
       else
         System.out.println(a + " " + c + " " + b + ".");
     }
     if (b >= a && b >= c) {
       if (a >= c)
         System.out.println(b + " " + a + " " + c + ".");
       else
         System.out.println(b + " " + c + " " + a + ".");
     }
     if (c >= a && c >= b){
       if (a >= b)
         System.out.println(c + " " + a + " " + b + ".");
       else
         System.out.println(c + " " + b + " " + a + ".");
     }

   }
 }
