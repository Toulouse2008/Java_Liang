/** Exercise 7.13 Random number chooser
 *  Write a method that returns a random number between 1 and 54, excluding
 *  the numbers passed in the argument. The method header is specified as
 *  follows:
 *  public static int getRandom(int...numbers)
 */

public static int getRandom(int...numbers) {
  random = 1 + (int)(Math.random() * 55)
  return random;
}
