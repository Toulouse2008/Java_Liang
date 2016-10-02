/**2.10 calculate energy for boiling up water. Based on the following formula.
  Q = M*(finalTemperature -initialTempreature)*4184 */
import java.util.Scanner;

public class CalculateEnergy{
    public static void main(String[] args){
        double water;
        double finalTemperature, initialTemperature;
        double energy;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the water in kilograms:");
        water = input.nextDouble();
        System.out.println("Please enter the initial temperature:");
        initialTemperature = input.nextDouble();
        System.out.println("Please enter the final tempreature:");
        finalTemperature = input.nextDouble();

        energy = water * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + energy);
    }
}
