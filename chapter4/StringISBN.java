/** Exercise 4.19 Business: check ISBN-10
 *  Rewrite the programming Exercise 3.9 by entering the ISBN number as a string.
 */

 import java.util.Scanner;

 public class StringISBN {
   public static void main(String[] args) {

     System.out.println("Enter the first 9 digits of of ISBN:");

     Scanner input = new Scanner(System.in);
     String isbn = input.nextLine();
     System.out.println(isbn);

     // Calculate all the digits d1 to d9
     int d9 = isbn.charAt(8) - '0';
     int d8 = isbn.charAt(7) - '0';
     int d7 = isbn.charAt(6) - '0';;
     int d6 = isbn.charAt(5) - '0';;
     int d5 = isbn.charAt(4) - '0';
     int d4 = isbn.charAt(3) - '0';
     int d3 = isbn.charAt(2) - '0';
     int d2 = isbn.charAt(1) - '0';
     int d1 = isbn.charAt(0) - '0';

     // Calculate d10
     int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 +
               d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
     if (d10 == 10)
       System.out.println(isbn + "X");
     else
     System.out.println(isbn + d10);
   }
 }
