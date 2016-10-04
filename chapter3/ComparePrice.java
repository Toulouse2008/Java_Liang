/** Exercise 3.33 Financial: compare costs
 *  Suppose you shop for rice in two different packages. You would
 *  like to write a program to compare the cost. Prompts the user to
 *  enter the weight and price of each package and displays the one
 *  with the better price.
 */
 import java.util.Scanner;

 public class ComparePrice {
   public static void main(String[] args) {
     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter weight and price for package1:");
     double weight1 = input.nextDouble();
     double price1 = input.nextDouble();
     System.out.println("Enter weight and price for package2:");
     double weight2 = input.nextDouble();
     double price2 = input.nextDouble();
     double average1 = price1 / weight1;
     double average2 = price2 / weight2;
     if(average1 == average2)
       System.out.println("Package 1 and 2 have the same price.");
     else if (average1 > average2)
       System.out.println("Package 2 has the better price.");
     else
       System.out.println("Package1 has the better price.");
   }
 }
