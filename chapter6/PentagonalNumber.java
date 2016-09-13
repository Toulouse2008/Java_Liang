/**output the first 100 pentagonal numbers defined by
   PentagonalNumber=n*(3*n-1)/2 */
public class PentagonalNumber{
  public static void main(String[] args){

    int counter = 1;
    for(counter = 1; counter <= 100; counter++){
      System.out.printf("%d\t", getPentagonalNumber(counter));
      if(counter % 10 == 0)
        System.out.println();
    }
  }

  static int getPentagonalNumber(int n){

      return n * ( 3 * n - 1) / 2;

    }
}
