/** Listing 6.2 test void method  **/

import java.util.Scanner;

public class ListingTestVoid{
  public static void main(String[] args){
    double grade;
    System.out.println("Enter your score, q to quit:");
    Scanner input = new Scanner(System.in);
    grade = input.nextDouble();
    System.out.print("The grade is " );
    printGrade(grade);
  }
  //void method printGrade
  public static void printGrade(double score){
    if(score < 0 || score > 100){
      System.out.println("Invalid score");
      return;
    }
    if(score >= 90)
      System.out.println('A');
    else if (score >= 80)
      System.out.println('B');
    else if (score >= 70)
      System.out.println('C');
    else if (score >= 60)
      System.out.println('D');
    else
      System.out.println('F');
  }
}
