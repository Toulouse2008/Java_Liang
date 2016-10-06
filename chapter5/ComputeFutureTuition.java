/** Exercise 5.7 Financial application: compute future tuition
 *  Suppose that the tuition for a university is $10,000 this year and increase
 *  5% every year. In one year, the tuition will be $10,500. Write a program that
 *  computes the tuition in ten years and the total cost of four years' worth of
 *  of tuition after the tenth year.
 */

 public class ComputeFutureTuition {
   public static void main(String[] args) {

     final double RATE = 0.05;
     final double TUITION = 10000;

     double futureTuition = TUITION;

     int year = 1;
     for (year = 1; year <= 10; year++) {
       futureTuition += futureTuition * RATE;
     }
     double totalTuition = futureTuition;
     for(year = 2; year <= 4; year++) {
       totalTuition += totalTuition * 0.05;
     }
     System.out.printf("The tuition in 10 years will be %.2f. The total cost" +
                       "of 4 years is %.2f\n", futureTuition, totalTuition);
   }
 }
