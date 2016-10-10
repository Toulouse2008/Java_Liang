/** Listing 6.1 Max test */

public class Listing6_1 {
  public static void main(String[] args){

    System.out.println("Sum from 1 to 10 is " + sum(1, 10));
    System.out.println("Sum from 20 to 37 is " + sum(20, 37));
    System.out.println("Sum from 35 to 49 is " + sum(35, 49));
  }

  public static int sum(int m, int n){
    int result = 0;
    for (int i = m; i <= n; i++)
      result += i;
    return result;
  }
}
