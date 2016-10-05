/** Days of month
 *  Write a program that prompts the user to enter a year and the first three
 *  letters of a months name (With the first letter in uppercase) and displays
 *  the number of days in the month.
 */

 import java.util.Scanner;

 public class DaysOfMonth {
   public static void main(String[] args) {

     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a year: ");
     int year = input.nextInt();
     System.out.println("Enter a month: ");
     String month = input.next();

     // Validate input
     if (month.length() > 3 || month.length() == 0)
       System.out.println("Invalid input");

     // Calculate and output result
     switch(month) {
       case "Jan":
         System.out.println(month + " " + year + " has 31 days");
         break;
       case "Feb":{
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
           System.out.println(month + " " + year + " has 29 days");
         else
           System.out.println(month + " " + year + " has 28 days");
         }
         break;
       case "Mar":
         System.out.println(month + " " + year + " has 31 days");
         break;
       case "Apr":
         System.out.println(month + " " + year + " has 30 days");
         break;
       case "May":
         System.out.println(month + " " + year + " has " + 31 + " days");
         break;
       case "Jun":
         System.out.println(month + " " + year + " has 30 days");
         break;
       case "Jul":
         System.out.println(month + " " + year + " has " + 31 + " days");
         break;
       case "Aug":
         System.out.println(month + " " + year + " has " + 31 + " days");
         break;
       case "Sep":
         System.out.println(month + " " + year + " has 30 days");
         break;
       case "Oct":
         System.out.println(month + " " + year + " has " + 31 + " days");
         break;
       case "Nov":
         System.out.println(month + " " + year + " has 30 days");
         break;
       case "Dec":
         System.out.println(month + " " + year + " has " + 31 + " days");
         break;
     }
   }
 }
