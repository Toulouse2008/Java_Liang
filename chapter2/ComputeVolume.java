/** 2.2 Compute the volume of a cynlinder */

import java.util.Scanner;

public class ComputeVolume{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.println("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = PI * radius * radius;
        double volume = area * length;
        System.out.println("The area is " + area +
            "\n" + "The volume is " + volume);
    }
}

