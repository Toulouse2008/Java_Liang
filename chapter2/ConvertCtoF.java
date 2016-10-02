/** Exercise 2.1 Convert Celsius to Fahrenheit*/

import java.util.Scanner;

public class ConvertCtoF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.printf("%.1f Celsius is %.1f Fahrenheit\n", 
            celsius, fahrenheit);
    }
}
