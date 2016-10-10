/** Exercise 6.16 Number of days in a year
 *  Write a method that returns the number of days in a year
 *  using the following header:
 *  public static int numberOfDaysInAYear(int year)
 *  Write a test program that displays the number of days in
 *  year from 2000 to 2020.
 */

public class E616_DaysInAYear {
  public static void main(String[] args) {

    System.out.print("Year\tDays\n");
    for (int year = 2000; year <= 2020; year++) {
      System.out.printf("%4d\t%3d\n", year, numberOfDaysInAYear(year));
    }
  }

  // Define the method to calculate days in a year
  public static int numberOfDaysInAYear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
      return 366;
    else
      return 365;
  }
}
