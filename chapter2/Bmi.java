/** Body mass index BMI = (weight (pounds) / height (inches) * height (inches)) * 703 */

import java.util.Scanner;

public class Bmi{
    public static void main(String[] args){
        double  weight, height, BodyWeightIndex;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        height = input.nextDouble();

        BodyWeightIndex = 703* weight / (height * height);

        System.out.println("BMI is " + BodyWeightIndex);
    }
}
