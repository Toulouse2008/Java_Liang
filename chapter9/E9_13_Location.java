import java.util.Scanner;
import java.util.Random;

public class E9_13_Location {
  public static void main(String[] args) {

    System.out.println("Enter the numbers for the row and column: ");
    Scanner input = new Scanner(System.in);
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] myArray = new double[row][column];

    //Random randomNum = new Random(1000);

    for(int i = 0; i < row; i++) {
      for(int j = 0; j < column; j++) {
        myArray[i][j] = Math.random() * 10000;
      }
    }

    Location locateLargest = new Location(myArray, row, column);
    for(int i = 0; i < row; i++) {

      for(int j = 0; j < column; j++) {
        System.out.printf(" %4.2f ", myArray[i][j]);
      }
      System.out.println();
    }

      System.out.println();
      System.out.printf("The largest is : %4.2f.\n", locateLargest.getMaxValue(myArray));
  }
}

class Location {
  public double maxValue;
  public int row, column;

  Location(double a[][], int row, int column) {
    this.row = row;
    this.column = column;
    setMaxValue(a);
  }

  public void setMaxValue(double array[][]) {
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < column; j++) {
        if (maxValue < array[i][j])
          maxValue = array[i][j];
      }
    }
  }

  public double getMaxValue(double array[][]) {
    return this.maxValue;
  }
}
