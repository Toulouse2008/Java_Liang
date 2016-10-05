/** Exercise 4.25 Generate vehicle plate numbers
 *  Assume a vehicle plate number consists of three uppercase letters followed
 *  by four digits. Write a program to generate a plate numbers.
 */

public class GeneratePlateNumber {
  public static void main(String[] args) {

    // Generate four random integers from 0 to 9
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    int number3 = (int)(Math.random() * 10);
    int number4 = (int)(Math.random() * 10);

    // Generate 3 uppercase characters
    char ch1 = (char)('A' + (int)(Math.random() * 26));
    char ch2 = (char)('A' + (int)(Math.random() * 26));
    char ch3 = (char)('A' + (int)(Math.random() * 26));

    // Output result
    System.out.printf("The vehicle plate number is %c%c%c%d%d%d%d\n" ,
           ch1, ch2, ch3, number1, number2, number3, number4);
  }
}
