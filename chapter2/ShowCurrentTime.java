/** List 2.7 show current time through Epoch of UNIX */

public class ShowCurrentTime {
    public static void main(String[] args){
        long MilliSeconds = System.currentTimeMillis();
        long TotalSeconds = MilliSeconds / 1000;
        long CurrentSecond = TotalSeconds % 60;
        long TotalMinutes = TotalSeconds / 60;
        long CurrentMinute = TotalMinutes % 60;
        long TotalHours = TotalMinutes / 60;
        long CurrentHour = TotalHours % 24;
        //Display Results
        System.out.println("Current time is " + CurrentHour + ":" +
            CurrentMinute + ":" + CurrentSecond + " GMT");
    }
}
