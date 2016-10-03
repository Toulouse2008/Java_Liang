/** Exercise 3.11 Find the number of days in a month  */

import java.util.Scanner;

public class NumberOfDaysInAMonth {
  public static void main(String[] args) {
    // Get input from user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter year:");
    int year = input.nextInt();
    System.out.println("Enter month:");
    int monthNumber = input.nextInt();

    int days = 0;
    String month = "";

    // Determine days in each month
    switch(monthNumber){
      case 1: {
        month = "January";
        days = 31;
        break;
      }
      case 2: {
        month = "Februay";
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
          days = 29;
        else
          days = 28;
        break;
      }
      case 3: {
        month = "March";
        days = 31;
        break;
      }
      case 4: {
        month = "April";
        days = 30;
        break;
      }
      case 5: {
        month = "May";
        days = 31;
        break;
      }
      case 6: {
        month = "June";
        days = 30;
        break;
      }
      case 7: {
        month = "July";
        days = 31;
        break;
      }
      case 8: {
        month = "August";
        days = 31;
        break;
      }
      case 9: {
        month = "September";
        days = 30;
        break;
      }
      case 10: {
        month = "October";
        days = 31;
        break;
      }
      case 11: {
        month = "November";
        days = 30;
        break;
      }
      case 12: {
        month = "December";
        days = 31;
        break;
      }
    }
    // Output data
    System.out.println(month + " " + year + " had " + days + " days.");
  }
}
