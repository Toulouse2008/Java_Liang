/** Exercise 6.5 Sort three integers with if-statements */
import java.util.Scanner;

public class SortThreeTest{
  public static void main(String[] args){
    System.out.println("Hello");
    Scanner input = new Scanner(System.in);
    double l, m, n;
    System.out.println("Enter three number separated by spaces:");
    l = input.nextDouble();
    m = input.nextDouble();
    n = input.nextDouble();
    displaySortedNumbers(l, m, n);
  }
  //sort three number with nested if statements
  public static void displaySortedNumbers(double a,
  double b, double c){
    double max, mid, min;
    if(a>b){
      if(a>c){
        max = a;
        if(b>c){
          mid = b;
          min = c;
        }else{
          mid = c;
          min = b;
        }
      }else{
        max = c;
        mid = a;
        min = b;
      }
    }
    else{
      if(c < b){
        max = b;
        if(a > c){
          mid = a;
          min = c;
        }else{
          mid = c;
          min = a;
        }
      }else{
        max = c;
        mid = b;
        min = a;
      }
    }
  System.out.printf("Descended:%f\t%f\t%f\n", max, mid, min);
  System.out.printf("Ascended:%f\t%f\t%f\n", min, mid, max);
  }
}
