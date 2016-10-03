/** Exercise 3.30 Revise Programming Exercise 2.8 to display the
 *  hour using a 12-hour clock;
 */

import java.util.Scanner;

public class CurrentTime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        long MilliSeconds = System.currentTimeMillis();
        long TotalSeconds = MilliSeconds / 1000;
        long CurrentSecond = TotalSeconds % 60;
        long TotalMinutes = TotalSeconds / 60;
        long CurrentMinute = TotalMinutes % 60;
        long TotalHours = TotalMinutes / 60;
        long CurrentHour = TotalHours % 24;
        long test = CurrentHour + offset;
        if(test < 0) {
            CurrentHour = 24 + test;
           }
        if(test > 24){
            CurrentHour = test - 24;
            }

        //Display Results
        if (CurrentHour < 12)
          System.out.println("Current time is " + CurrentHour + ":" +
            CurrentMinute + ":" + CurrentSecond + " AM");
        else
          System.out.println("Current time is " + CurrentHour + ":" +
            CurrentMinute + ":" + CurrentSecond + " PM");
    }
}
