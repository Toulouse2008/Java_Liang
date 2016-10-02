/** Compute area of hexagon area = 3*sqrt(3) * s^2 /2 */

import java.util.Scanner;

public class Hexagon{
    public static void main(String[] args){

        double side, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        side = input.nextDouble();
        area = 3 * Math.pow(3, 0.5) * side * side / 2;

        System.out.println("The area of the hexagon is " + area);
    }
}
