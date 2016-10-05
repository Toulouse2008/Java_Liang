/** Listing 5.6 Test do-while loop  */

import java.util.Scanner;

public class TestDoWhile {
  public static void main(String[] args) {

    int data;
    int sum = -1;
    Scanner input = new Scanner(System.in);

    // Do-while keeps reading data until the input is 0
    do {
      System.out.println("Enter an integer(0 to quit):");
      data = input.nextInt();
      sum += data;
    } while(data != 0);
    System.out.println("The sum is " + sum);
  }
}
