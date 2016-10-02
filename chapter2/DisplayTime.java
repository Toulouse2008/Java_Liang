/** List 2.5 Display time from seconds to minutes */

import java.util.Scanner;

public class DisplayTime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of seconds: ");
        int TotalSeconds = input.nextInt();
        int minutes = TotalSeconds / 60;
        int seconds = TotalSeconds % 60;
        System.out.println(TotalSeconds + " is " + minutes + " minutes and " +
            seconds + "seconds.");
    }
}
