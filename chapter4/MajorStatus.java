/** Exercise 4.18 Student major and status
 *  Write a program that prompts the user to enter two characters and displays
 *  the major and status represented in the characters. The first character
 *  indicates the major and the second is the number character 1, 2, 3, 4, which
 *  indicates whether a student is a freshman, sophomore, junior, or senior.
 *  Suppose the following characters are used to denote the majors:
 *  M: Mathematics; C: Computer Science; I: Information Technology.
 */

import java.util.Scanner;

public class MajorStatus {
  public static void main(String[] args){

    // Get input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two characters:");
    String status = input.nextLine();
    char status1 = status.charAt(0);
    char status2 = status.charAt(1);

    String rank =" ";
    String major =" ";

    // Calculate corresponding statuses
    switch(status1){
      case 'M':
        major = "Mathematics";
        break;
      case 'C':
        major = "Computer Science";
        break;
      case 'I':
        major = "Information Technology";
        break;
      default:
        major = "Invalid input";
        break;
    }
    switch(status2){
      case '1':
        rank = "Freshman";
        break;
      case '2':
        rank = "Sophomore";
        break;
      case '3':
        rank = "Junior";
        break;
      case '4':
        rank = "Senior";
        break;
      default:
        rank = "Invalid input";
        break;
    }

    // Output result
    if (rank =="Invalid input" || major == "Invalid input")
      System.out.println("Invalid input");
    else
      System.out.println(major + " " + rank);
  }
}
