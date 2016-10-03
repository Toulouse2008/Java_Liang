/** Exercise 3.14 Game: heads and tails
 *  Write a program that lets the users guess whether the flip of
 *  a coin results in head or tails. The program randomly generates
 *  an integer 0 or 1.
 */
 import java.util.Scanner;

 public class HeadsOrTails {
   public static void main(String[] args) {

     // Get input from user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a guess, 0 or 1:");
     int guess = input.nextInt();
     // Generate random 0s and 1s
     int coin = (int)(System.currentTimeMillis() / 1000 % 2);

     // Determine if the user's guess is correct
     if (coin == guess)
       System.out.println("The guess is correct!");
     else
       System.out.println("The guess is incorrect!");
   }
 }
