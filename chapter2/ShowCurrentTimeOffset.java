/** 2.8 Modified timezone offset  from List 2.7 show current time through Epoch  of UNIX */
import java.util.Scanner;

public class ShowCurrentTimeOffset{
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
        System.out.println("Current time is " + CurrentHour + ":" +
            CurrentMinute + ":" + CurrentSecond + " GMT");
    }
}
