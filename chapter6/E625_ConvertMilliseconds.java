/** Exercise 6.25 Convert milliseconds to hours, minutes, and seconds
 */

import java.util.Scanner;

public class E625_ConvertMilliseconds {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the milliseconds: ");
    long milliseconds = input.nextLong();

    // Invoke the covertMillis method
    String convertedMillis = convertMillis(milliseconds);
    System.out.println(convertedMillis);
  }

  /** Define the convertMillis method */
  public static String convertMillis(long millis) {
    long seconds = 0;
    long hours = 0;
    long minutes = 0;

    seconds = millis / 1000;
    hours = seconds / 3600;
    seconds = seconds % 3600;
    minutes = seconds / 60;
    seconds = seconds % 60;
    String time = hours + ":" + minutes + ":" + seconds;
    return time;
  }
}
