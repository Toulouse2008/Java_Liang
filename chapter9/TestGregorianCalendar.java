/** Exercise 9.5 Gregorian Calendar class */
import java.util.GregorianCalendar;

public class TestGregorianCalendar{
  public static void main(String[] args){
    GregorianCalendar calendar1 = new GregorianCalendar();

    System.out.println(calendar1.get(GregorianCalendar.YEAR));
    System.out.println(calendar1.get(GregorianCalendar.MONTH));
    System.out.println(calendar1.get(GregorianCalendar.DAY_OF_MONTH));
  }
}
