/** 2.7 Find the number of years. Assume a year has 365 days for simplicity. */

import java.util.Scanner;

public class NumberOfYears{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();
        int day = 60 * 24;
        int year = day * 365;
        int years = minutes / year;
        int remainder = minutes % year;
        int days = remainder / day;
        remainder = remainder % day;
        int hours = remainder / 60;
        int LeftMinutes = remainder % 60;
        System.out.println(minutes + " is approximately " + years +
             " years " + days + " days " + hours + " hours " + 
            LeftMinutes +" minutes");
    }
}
