/** Listing 7.5 variable length arguments demo */

public class Listing75_VarArgsDemo {
  public static void main(String[] args) {

    printMax(34, 3, 3, 4, 56.6);
    printMax(new double[]{1, 2, 3});
  }

  public static void printMax(double...numbers) {
    if (numbers.length == 0) {
      System.out.println("No arguments passed");
      return;
    }

    double result = numbers[0];

    for (int i = 1; i < numbers.length; i++)
      if (numbers[i] > result)
        result = numbers[i];

    System.out.println("The max value is " + result);
  }
  
}
