/** Exercise 5.19 Display numbers in a pyramid pattern
 *  Write a nested for loop that prints the following pattern:
 */

 import java.util.Scanner;

 public class Pattern2n {
   public static void main(String[] args) {

     // Get the input from the user
     System.out.println("Enter the number of lines: ");
     Scanner input = new Scanner(System.in);
     int numberOfLines = input.nextInt();

     pyramidPattern(numberOfLines);
   }

   // Display numbers in a pyramid pattern
   public static void pyramidPattern(int n) {
     int m = 0;
     for (int i = 0; i < n; i++){
       for (int j = n - i - 1; j > 0; j--){
         System.out.print("    ");
       }
       for (int k = 0; k <= i; k++) {
         m = (int)(Math.pow(2, k));
         if (m < 10)
         System.out.print(m + "   ");
         else if (m < 100)
           System.out.print(m + "  ");
         else
           System.out.print(m + " ");
       }
       for (int l = i -1; l >= 0; l--) {
         if ((int)Math.pow(2, l) < 10)
         System.out.print((int)Math.pow(2, l) + "   ");
         else if ((int)Math.pow(2, l) < 100)
           System.out.print((int)Math.pow(2, l) + "  ");
         else
           System.out.print((int)Math.pow(2, l) + " ");
       }
       System.out.println();

     }
   }

 }
