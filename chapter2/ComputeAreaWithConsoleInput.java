/** Listing 2.1 compute area with console input */

import java.util.Scanner;
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println("The area of the circle with radius of " + radius +
            " is " + area);
    }
}
