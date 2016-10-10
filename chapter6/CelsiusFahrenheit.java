/** Exercise 6.8 Conversions between Celsius and Fahrenheit
 *  Write a class that contains two methods to convert between
 *  c to f and f to c.
 */

 import java.util.Scanner;

 public class CelsiusFahrenheit {
   public static void main(String[] args) {

     // Get test data from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the temperature in c: ");
     double c = input.nextDouble();
     System.out.println("Enter the temperature in f: ");
     double f = input.nextDouble();

     double c2f = celsiusToFahrenheit(c);
     double f2c = fahrenheitToCelsius(f);

     System.out.println("The Fahrenheit is " + c2f);
     System.out.println("The Celsius is " + f2c);
   }

   // Define the method to convert from celsius to Fahrenheit
   public static double celsiusToFahrenheit(double celsius) {
     return (9.0 / 5) * celsius + 32;
   }

   // Define the method that convert Fahrenheit to Celsius
   public static double fahrenheitToCelsius(double fahrenheit){
     return (5.0 / 9) * (fahrenheit - 32);
   }
 }
