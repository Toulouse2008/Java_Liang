/** 2.15 compute the distance of two point */

import java.util.Scanner;

public class DistanceTwo{
    public static void main(String[] args){

        double tmp, x1, x2, y1, y2, distance;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1 and y1:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Enter x2 and y2:");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        tmp = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        distance = Math.pow(tmp, 0.5);

        System.out.println("The distance between the two points is " +
            distance);

    }
}
