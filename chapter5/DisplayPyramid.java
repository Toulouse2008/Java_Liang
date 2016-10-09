/** Exercise 5.17 Display pyramid
 *  Write program that prompts the user to enter an integer from 1 to 15
 *  and display a pyramid.
 */

 import java.util.Scanner;

 public class DisplayPyramid {
   public static void main(String[] agrs) {

     // Get the input from the user
     System.out.println("Enter the number of lines: ");
     Scanner input = new Scanner(System.in);
     int numberOfLine = input.nextInt();
     int n = numberOfLine;

     // Output the pyramid
     System.out.println("The number pyramid: ");
     for(int i = 0; i < numberOfLine; i++){
       for(int j = numberOfLine - i; j > 1; j--){
         System.out.print("   ");
       }
       for (int k = i + 1; k >= 1; k--) {
         if (k < 10)
           System.out.print(k + "  ");
         else
           System.out.print(k + " ");
       }
       for (int l = 2; l <= i + 1; l++) {
         if (l < 10)
           System.out.print(l + "  ");
         else
           System.out.print(l + " ");
       }
       System.out.println();
     }

     System.out.println("Pyramid upside down!");

     // Output the pyramid upside down
     for(int i = numberOfLine; i > 0; i--){
       for(int j = numberOfLine - i; j > 0; j--){
         System.out.print("   ");
       }
       for (int k = i; k > 0; k--) {
         if (k < 10)
           System.out.print(k + "  ");
         else
           System.out.print(k + " ");
       }
       for (int l = 2; l <= i; l++) {
         if (l < 10)
           System.out.print(l + "  ");
         else
           System.out.print(l + " ");
       }
       System.out.println();
     }

     System.out.println("Diamond: ");

     // Output a diamond
     // Upper part
     for(int i = 0; i < numberOfLine; i++){
       for(int j = numberOfLine - i; j > 1; j--){
         System.out.print("   ");
       }
       for (int k = i + 1; k > 0; k--) {
         if (k < 10)
           System.out.print(k + "  ");
         else
           System.out.print(k + " ");
       }
       for (int l = 2; l <= i + 1; l++) {
         if (l < 10)
           System.out.print(l + "  ");
         else
           System.out.print(l + " ");
       }
       System.out.println();
     }

     // lower part
     for(int i = numberOfLine - 1; i > 0; i--){
       for(int j = numberOfLine - i; j > 0; j--){
         System.out.print("   ");
       }
       for (int k = i; k > 0; k--) {
         if (k < 10)
           System.out.print(k + "  ");
         else
           System.out.print(k + " ");
       }
       for (int l = 2; l <= i; l++) {
         if (l < 10)
           System.out.print(l + "  ");
         else
           System.out.print(l + " ");
       }
       System.out.println();
     }

   }
 }
