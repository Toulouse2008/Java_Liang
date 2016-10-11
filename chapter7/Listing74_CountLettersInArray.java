/** Listing 7.4 counter letters in array */
public class CountLettersInArray{
  /** Main method */
  public static void main(String[] args){
    //Declare and create an array
    char[] chars = createArray();

    //Display the array
    System.out.println("The lowercase letters are: ");
    displayArray(chars);
    // Count the occurrences of each letters
    int[] counts = countLetters(chars);

    //Display countLetters
    System.out.println();
    System.out.println("The occurence of each letters are: ");
    displayCounts(counts);
  }

  /** Create an array of characters */
  public static char[] createArray(){
    //Declare an array of characters and create it
    char[] chars = new char[100];

    //Create lowercase letters randomly and assign them to the array
    for(int i = 0; i < chars.length; i++)
      chars[i] = RandomCharacter.getRandomLowerCaseLetter();
    // Return array
    return chars;
  }
  /** Display the array of characters */
  public static void displayArray(char[] chars){
    //Display the characters in the array 20 per line
    for(int i = 0; i < chars.length; i++){
      if((i + 1) % 20 == 0)
        System.out.println(chars[i]);
      else
        System.out.print(chars[i] + " ");
    }
  }
  /** Count the occurrences of each letters */
  public static int[] countLetters(char[] chars){
    //Declare and create an array of 26 int
    int[] counts = new int[26];
    //For each lowercase letter in array, count it
    for(int i = 0; i < chars.length; i++)
      counts[chars[i] - 'a']++;
    return counts;
  }
  /** Display counts */
  public static void displayCounts(int[] counts){
    for(int i = 0; i < counts.length; i++){
      if((i + 1) % 10 == 0)
        System.out.println(counts[i] + " " + (char)(i + 'a'));
      else
        System.out.print(counts[i] + " " + (char)(i + 'a') + ' ');
    }
    System.out.println();
  }
}
  /** Random character class */
class RandomCharacter{
  /** Generat a random character between chq and ch2 */
  public static char getRandomCharacter(char ch1, char ch2){
    return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
  }
  /** Genereate a random lowercase letter */
  public static char getRandomLowerCaseLetter(){
    return getRandomCharacter('a', 'z');
  }
  /** Generate random upper case letter */
  public static char getRandomUpperCaseLetter(){
    return getRandomCharacter('A', 'Z');
  }
  /** Generate a random digit character */
  public static char getRandomDigitCharacter(){
    return getRandomCharacter('0', '9');
  }
  /** Generate a random character */
  public static char getRandomCharacter(){
    return getRandomCharacter('\u0000', '\uFFFF');
  }
}
