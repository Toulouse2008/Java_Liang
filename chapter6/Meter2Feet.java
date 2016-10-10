/** Exercise 6.9 Conversions between feet and meters
 *  Write a class that contains the following two methods
 */
public class Meter2Feet{
  public static void main(String[] args){
    int feet1,  meters2;
    double meters1, feet2, feet3, meters3;

    for(feet1 = 1; feet1 <= 10; feet1++){
      meters1 = MeterFeet.footToMeter((double)feet1);
      feet2 = (double)feet1;

      System.out.printf("%2.1f\t%1.3f\t|\n", feet2, meters1);
    }
    for( meters2 = 20; meters2 <= 65; meters2 += 5){
      feet3 = MeterFeet.meterToFoot((double)meters2);
      meters3 = (double)meters2;
      System.out.printf("\t%2.1f\t%3.3f\n", feet3, meters3);
    }
  }
}
class MeterFeet{
  //clas concstructor
  MeterFeet(double d){
    double meter = d;
    double foot = d;
  }
  //convert foot to meter
  public static double footToMeter(double foot){
    return 0.305 * foot;
  }
  //convert meter to foot
  public static double meterToFoot(double meter){
    return 3.279 * meter;
  }
}
