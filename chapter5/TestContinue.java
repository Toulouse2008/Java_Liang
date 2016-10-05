/** Listing 5.13 Test continue */

public class TestContinue {
  public static void main(String[] args) {
     int sum = 0;
     int number = 0;

     while (number < 20) {
       number++;
       if (number == 10 || number == 11)
         continue;
       sum += number;
     }
     System.out.printf("The sum is %d\n", sum);

     // Now remove the continue
     sum = 0;
     number = 0;

     while (number < 20) {
       number++;
       sum += number;
     }
     System.out.printf("Remove the continue, and the sum is %d\n", sum);
  }
}
