/** Exercise 3.18 Cost of shipping
 *  Prompts the user to enter the weight of the package and display the shipping
 *  cost. If the weight is greater than 20, display "The package cannot be shipped".
 */

 import java.util.Scanner;

 public class CostOfShipping {
   public static void main(String[] args) {
     // Get input from user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter package weight:");
     double weight = input.nextDouble();
     double cost = 0;

     if (weight <= 1){
       cost = 3.5;
       System.out.println("The cost of shipping is $" + cost + ".");
     }
     else if (weight > 1 && weight <= 3){
       cost = 9;
       System.out.println("The cost of shipping is $" + cost + ".");
     }
     else if (weight > 3 && weight <= 10){
       cost = 17.5;
       System.out.println("The cost of shipping is $" + cost + ".");
     }
     else if (weight > 10 && weight <= 20) {
       cost = 28;
       System.out.println("The cost of shipping is $" + cost + ".");
     }
     else{
       System.out.println("The package can not be shipped.");
     }

   }
 }
