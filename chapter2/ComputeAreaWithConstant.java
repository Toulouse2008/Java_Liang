/** List 2.4 compute area with constant */

import java.util.Scanner;

public class ComputeAreaWithConstant{
    public static void main(String[] args){
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area of the circle with radius of " +
            radius + " is " + area);
    }
}        
