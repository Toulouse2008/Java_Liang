/** List 2.6 F to C */

import java.util.Scanner;

public class FahrenheitToC {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +
            celsius + " in Celsius");
    }
}
