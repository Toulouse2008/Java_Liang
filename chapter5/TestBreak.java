/** Listing 5.12 Test break key words */

public class TestBreak {
  public static void main(String[] args) {
    int sum =0;
    int number = 0;

    while (number < 20) {
      number ++;
      sum += number;
      if (sum > 100)
        break;
    }
    System.out.printf("The number and the sum are %d and %d\n", number, sum);

    // No break
    number = 0;
    while (number < 20) {
      number ++;
      sum += number;
    }
    System.out.println("Now, BREAK is removed!");
    System.out.printf("The number and the sum are %d and %d\n", number, sum);
  }
}
