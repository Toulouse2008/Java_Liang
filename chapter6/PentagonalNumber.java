/** Exercise 6.1 Math: pentagonal numbers
 *  A petagonal number is defined as n(3n-1)/2 for n = 1,2,... and so on
 *  Write a method that output the first 100 pentagonal numbers defined by
 *  PentagonalNumber=n*(3*n-1)/2
 */

public class PentagonalNumber{
  public static void main(String[] args){

    int counter = 1;
    for(counter = 1; counter <= 100; counter++){
      System.out.printf("%d\t", getPentagonalNumber(counter));
      if(counter % 10 == 0)
        System.out.println();
    }
  }

  // Define the method
  static int getPentagonalNumber(int n){

      return n * ( 3 * n - 1) / 2;
    }
}
