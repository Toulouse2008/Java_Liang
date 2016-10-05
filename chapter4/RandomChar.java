/** Exercise 4.16 Random character
 *  Wwrite a program that displas a random uppercase letter using the Math.random()
 *  method.
 */

public class RandomChar {
  public static void main(String[] args) {
    int ch = 65 + (int)(Math.random() * 25);
    System.out.println("You random character is " + (char)ch);
  }
}
