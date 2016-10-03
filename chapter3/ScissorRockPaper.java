/** Exercise 3.17 Game: scissor, rock, paper
 *  Write a program that diplays the popular scissor-rock-paper game. The program
 *  randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
 *  Prompt the user to enter 0, 1, or 2, diplay whether the user or computer win,
 *  loses, or draws.
 */
 import java.util.Scanner;

 public class ScissorRockPaper {
   public static void main(String[] args){

     // Get input from user
     Scanner input = new Scanner(System.in);
     System.out.println("scissor(0), rock(1), paper(2):");
     int userGuess =input.nextInt();

     // Get computer's number
     int computerGuess = (int)(Math.random() * 3);

     // Determine who win and output the results
     switch(userGuess) {
       case 0: {
         switch(computerGuess) {
           case 0: System.out.println("The computer is scissor. You are scissor. It is a draw"); break;
           case 1: System.out.println("The computer is rock. You are scissor. Computer won"); break;
           case 2: System.out.println("The computer is paper. You are scissor. You won"); break;
         }
         break;
       }
       case 1: {
         switch(computerGuess) {
           case 0: System.out.println("The computer is scissor. You are rock. You won "); break;
           case 1: System.out.println("The computer is rock. You are rock. It is a draw"); break;
           case 2: System.out.println("The computer is paper. You are rock. Computer won"); break;
         }
         break;
       }
       case 2: {
         switch(computerGuess){
           case 0: System.out.println("The computer is scissor. You are paper. Computer won"); break;
           case 1: System.out.println("The computer is rock. You are paper. You won"); break;
           case 2: System.out.println("The computer is paper. You are paper. It is a draw"); break;
         }
         break;
      }
    }

   }
 }
