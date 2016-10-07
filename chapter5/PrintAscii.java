/** 5.15 Display the ASCII character table
 *  Write a program that prnts the characters in the Ascii character table
 *  from ! to ~ ten per line.
 */

 public class PrintAscii {
   public static void main(String[] args) {

     for (int i = 33; i <= 126; i++) {
       System.out.print((char)i + " ");
       if(i != 0 && i % 10 == 0) {
         System.out.println();
       }
     }
     System.out.println();

   }
 }
