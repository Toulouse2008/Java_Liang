/** Listing6.1 */

public class TestMax{
  //main method
  public static void main(String[] args){
    int i = 5;
    int j = 2;
    int k = 10;
    int larger = bigger(i, j);
    int largest = biggest(i, j, k);
    System.out.println("The largest is " + largest);
    System.out.println("The larger is " + larger);
  }

  //Return the max of two
  public static int bigger(int numA, int numB){
    int result;
    if (numA > numB)
      result = numA;
    else
      result = numB;
    return result;
  }
  //Test 3 numbers
  public static int biggest(int l, int m, int n){
    int temp = bigger(l, m);
    int max = bigger(temp, n);
    return max;
  }
}
