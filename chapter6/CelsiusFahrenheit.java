/** Exercise 6.8 Conversions between Celsius and Fahrenheit
 *  Write a class that contains two methods to convert between
 *  c to f and f to c.
 */

 import java.util.Scanner;

 public class CelsiusFahrenheit {
   public static void main(String[] args) {

     double celsius = 40.0;
     double fahrenheit = 120.0;

     // Call the methods and output the table
     System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
     for (int i = 0; i <9; i++) {
       System.out.printf("%-6.1f\t%-10.1f\t|\t%-10.1f\t%-6.1f\n",
              celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
       celsius -= 1;
       fahrenheit -= 10;
     }
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
