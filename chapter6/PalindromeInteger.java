/**Deterimine if a number is palindrome integer */
import java.util.Scanner;

public class PalindromeInteger{
  public static void main(String[] arg){

    System.out.println("Enter an integer:");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int temp = reverse(number);
    boolean tf = isPalindrome(number, temp);
    if(tf = true){
      System.out.printf("%d is a palindrome number.\n", number);
    } else {
      System.out.printf("%d is not a palindrome number.\n", number);
    }

  }
  //Generate the reverse version of the number
  public static int reverse(int number){
    int temp = 0;
    if(number % 10 == 0){//no integer starts with 0
      System.out.println("No number start with 0!");
      return temp;
    }
    if(number < 10)
      return number;
    while(number >= 10){
      if(number % 10 == 0){
        temp = temp * 10;
        number = number / 10;
      } else{
        temp = temp * 10 + number % 10;
        number = number / 10;
      }
    }
    return number + temp * 10;
  }
  //evaluate if the original number is equal to its reversed version
  public static boolean isPalindrome(int number, int numberR){
    if(number == numberR)
        return true;
    else
        return false;
  }
}
