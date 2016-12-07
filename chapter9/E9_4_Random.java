import java.util.Random;

public class E9_4_Random {
  public static void main(String[] args) {

    Random generator = new Random(1000);
    int count = 0;


    while( count < 50) {
      int randomNum = generator.nextInt();
      if(randomNum > 0 && randomNum < 100) {
        System.out.printf("%4d ", randomNum);
        count++;
        if(count % 10 == 0 && count != 0)
          System.out.println();
      }
    }
    System.out.println();
  }
}
