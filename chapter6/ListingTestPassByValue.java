/** Listing 6.5 test pass by value */

public class TestPassByValue{
  public static void main(String[] args){

    //Declare and initialize varialbes
    int num1 = 1;
    int num2 = 2;

    System.out.println("Before:" + num1 + " and " + num2);

    //invoke the swap method to attempt to swap two variables
    swapVoid(num1, num2);

    System.out.println("After invoking the swap num1 and num2: " +
           num1 + " and " + num2);
  }

  //Swap method
  public static void swapVoid(int n1, int n2){
    System.out.println("Inside the swap method:");
    System.out.println("Before: " + n1 + " and " + n2);

    //Swap n1 with n2
    int temp = n1;
    n1 = n2;
    n2 = temp;

    System.out.println("\t After Swapping: " + n1 + " and " + n2);
  }
}
