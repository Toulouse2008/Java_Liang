import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double number1 = input.nextDouble();
        System.out.println("Please enter the second number: ");
        double number2 = input.nextDouble();
        System.out.println("Please enter the third number: ");
        double number3 = input.nextDouble();
        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of the three number is " + average);
    }
}
          
          
          
