/** Exercise 3.21 Science: day of the week
 *  Zeller's congruence is an algorithm developed by Christian Zeller
 *  to calculate the day of the week. The formula is
 *  h =(q + 26(m+1)/10 + k + k/4 + j/4 + 5j) % 7
 *  Write a program to ask user input a year, month, and day of the month
 *  and displays the name of the day of the week.
 */
 import java.util.Scanner;

 public class DayOfWeek {
   public static void main(String[] args) {
     // Get input from user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter year (e.g., 2012):");
     int year = input.nextInt();
     System.out.println("Enter month(1-12):");
     int m = input.nextInt();
     System.out.println("Enter the day of the month");
     int q = input.nextInt();

     if (m == 1) {
       m = 13;
       year = year - 1;
     }
     else if(m == 2) {
       m = 14;
       year = year - 1;
     }
     int j = year / 100;
     int k = year % 100;
     int dayOfWeek = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 - 2*j) % 7;





     switch(dayOfWeek) {
       case 0: System.out.println("Day of week is Sunday"); break;
       case 1: System.out.println("Day of week is Monday"); break;
       case 2: System.out.println("Day of week is Tuesday"); break;
       case 3: System.out.println("Day of week is Wednesday"); break;
       case 4: System.out.println("Day of week is Thursday"); break;
       case 5: System.out.println("Day of week is Friday"); break;
       case 6: System.out.println("Day of week is Saturday"); break;
     }
   }
 }
