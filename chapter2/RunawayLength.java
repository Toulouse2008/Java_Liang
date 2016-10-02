/** 2.12 Finding runaway length based on length = v^2/2a m, m/s, m/s^2 */

import java.util.Scanner;

public class RunawayLength{
    public static void main(String[] args){
        double velocity, acceleration, length;
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        velocity = input.nextDouble();
        acceleration = input.nextDouble();

        length = (velocity * velocity) / (2 * acceleration);
        System.out.println("The minimum runaway length for this airplane is " +
            length);
    }
}
