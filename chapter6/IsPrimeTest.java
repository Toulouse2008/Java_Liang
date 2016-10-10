import java.util.Scanner;
public class IsPrimeTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number;
    System.out.println("Enter an integer:");
    number = input.nextInt();

    isPrime(number);
    if(number != 0)
      System.out.println(number + " is a prime muber");
  }
  public static void isPrime(int n){
    int mid = n / 2;
    int i, prime;

    for(i = 2; i <= n/2; i++){
      if(n % i == 0){
        System.out.println("This number is not a prime");
      } else {
        System.out.printf("%d\t", i);
      }
    }
  }
}
