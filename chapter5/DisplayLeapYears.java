/** Exercise 5.27 Display leap years
 *  Write a program display all leap years, ten per line,from 101 to 2100,
 *  separated by exact one space. Also display the number of leap years in this
 *  period.
 */

 public class DisplayLeapYears {
   public static void main(String[] args) {

     int count = 0;
     int temp = 0;
     /** Method 1 check every year */
     long time1 = System.currentTimeMillis();
     for(int year = 101; year <= 2100; year++) {
       // Calculate leap years and output them
       if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
         System.out.printf("%4d ", year);
         count++;
       }
       // Control for 10 item per line
       if (count - temp == 10 && count % 10 == 0 && count != 0) {
         temp += 10;
         System.out.println();
       }
     }
     long time2 = System.currentTimeMillis();
     long timeA = time2 - time1;
     // Extra user friendly line
     System.out.println();
     System.out.print(timeA + "\n");

     /** Method 2 find the first leap year, then increment 4 for the next and
      *  check that number.
      */
    // Find the first leap year
    int years = 101;
    count = 0;
    temp = 0;
    long time3 = System.currentTimeMillis();
    while (!((years % 4 == 0 && years % 100 != 0) || years % 400 == 0)) {
      years++;
    }
    while (years <= 2100) {

      if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {
        System.out.print(years + " ");
        count++;

     }
     years += 4;
      // Control for 10 item per line
      if (count - temp == 10 && count % 10 == 0 && count != 0) {
        temp += 10;
        System.out.println();
      }
      //break;
    }
    long time4 = System.currentTimeMillis();
    long timeB = time4 - time3;

    // Extra user friendly line
    System.out.println();
    System.out.print(timeB + "\n");

   }
 }
