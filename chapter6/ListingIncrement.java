/** Listing 6.4 Increment */

public class ListingIncrement{
  public static void main(String[] args){

    int x = 1;
    System.out.println("Before the call, x is " + x);
    increment(x);
    System.out.println("After the call, x is " + x);
  }

  // increment method
  public static void increment(int n){
    n++;
    System.out.println("N inside the method is " + n);
  }
}
