/**input an integer, output reversed version, including 1000-->0001*/
import java.util.Scanner;

public class ReverseInt{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    reverse(number);
  }
  //reverse number
  public static void reverse(int n) {
    int temp = 0;
    int counter = 0;
    //test if the number end with 0, remove and count zeros
    while (n % 10 == 0){
      counter++;
      n /= 10;
    }
    //Reverse the number or the left-over after zeros removed
    while(n >= 10){
      temp = temp * 10 + n % 10;
      n /= 10;
    }
    if(counter == 0){
      System.out.println(temp * 10 + n);
    } else {
      for(int i = 0; i < counter; i++){//put counter 0 in front of reversed number
        System.out.print('0');
      }
      System.out.print(temp * 10 + n + "\n");
    }
  }
}
