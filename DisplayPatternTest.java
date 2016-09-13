/**Display a number pattern in a rectangle in which the upper half
   is filled with space*/
import java.util.Scanner;
public class DisplayPatternTest{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Please enter an integer smaller than 10:");
    int number = input.nextInt();

    displayPatternA(number);
    displayPatternB(number);
    displayTriangle(number);
  }
  //number triangle with the top apex in the middle
  public static void displayPatternA(int n){

    int i, j, k;

    for(i = 1; i <=n; i++){
      for(j = n; j > i; j--)
        System.out.print(" ");//space pattern control line, one space
      for(k = i; k > 0; k--){
          System.out.printf("%d ", k);
      }
      System.out.println();
    }

  }
  //no space, left-align nubmer triangle
  public static void displayPatternB(int n){

    int i, j, k;

    for(i = 1; i <=n; i++){
      for(j = n; j > i; j--)
        System.out.print("");//no space
      for(k = i; k > 0; k--){
          System.out.printf("%d ", k);
      }
      System.out.println();
    }

  }
  //two spaces, right-aligned number triangle
  public static void displayTriangle(int n){

    int i, j, k;

    for(i = 1; i <=n; i++){
      for(j = n; j > i; j--)
        System.out.print("  "); //control line-two spaces
      for(k = i; k > 0; k--){
          System.out.printf("%d ", k);
      }
      System.out.println();
    }

  }
}
