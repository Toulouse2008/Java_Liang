/** Listing 3.4 Compute and interpret BMI  */
import java.util.Scanner;

public class ComputeAndInterpretBMI{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter weight in pounds:");
    double weight = input.nextDouble();

    System.out.print("Enter height in inches:");
    double height = input.nextDouble();

    // Define the constants for convertion ratio lb to kg, in to m
    final double KILLOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    // Compute BMI
    double weightInKillograms = weight * KILLOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double bmi = weightInKillograms / (heightInMeters * heightInMeters);

    // Display result
    System.out.println("BMI is " + bmi);
    if(bmi < 18.5)
      System.out.println("Under Weight!");
    else if(bmi < 25)
      System.out.println("Normal");
    else if(bmi < 30)
      System.out.println("Over wieight");
    else
      System.out.println("Obese");
  }
}
