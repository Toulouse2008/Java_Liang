/** Check ISBN-10 (International Standard Book Number)
 *  Calculate the last digit d10, which is a checksum, according
 *  formula: (d1 x1 + d2 x 2 + d3 x 3 + d4 x 4 + d5 x 5 + d6 x 6 +
 *  d7 x 7 + d8 x 8 + d9 x 9) % 11. If the checksum is 10, the last
 *  digit is denoted as X.
 */

 /* ?Problem: can't deal with 0s that appear at the very beginning*/
 import java.util.Scanner;

 public class CheckISBN {
   public static void main(String[] args) {

     System.out.println("Enter the first 9 digits of of ISBN as integer:");

     Scanner input = new Scanner(System.in);
     int isbn = input.nextInt();
     System.out.println(isbn);

     // Calculate all the digits d1 to d9
     int d9 = isbn % 10;
     int temp = isbn / 10;
     int d8 = temp % 10;
     temp = temp / 10;
     int d7 = temp % 10;
     temp = temp / 10;
     int d6 = temp % 10;
     temp = temp / 10;
     int d5 = temp % 10;
     temp = temp / 10;
     int d4 = temp % 10;
     temp = temp / 10;
     int d3 = temp % 10;
     temp = temp / 10;
     int d2 = temp % 10;
     temp = temp / 10;
     int d1 = temp;

     // Calculate d10
     int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 +
               d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
     if (d10 == 10)
       System.out.println(d1 * 1000000000 + d2 * 100000000 +
              d3 * 10000000 + d4 * 1000000 + d5 * 100000 + d6 * 10000 +
              d7 * 1000 + d8 * 100 + d9 * 10 + "X");
     else
     System.out.println(d1 * 1000000000 + d2 * 100000000 +
            d3 * 10000000 + d4 * 1000000 + d5 * 100000 + d6 * 10000 +
            d7 * 1000 + d8 * 100 + d9 * 10 + d10);
   }
 }
