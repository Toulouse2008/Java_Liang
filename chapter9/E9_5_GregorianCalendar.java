import java.util.Calendar;
import java.util.GregorianCalendar;

public class E9_5_GregorianCalendar {
  public static void main(String[] args) {
    GregorianCalendar currentDate = new GregorianCalendar();

    System.out.println("Current year: " + currentDate.get(GregorianCalendar.YEAR));
    System.out.println("Current year: " + currentDate.get(GregorianCalendar.MONTH));
    System.out.println("Current year: " + currentDate.get(GregorianCalendar.DAY_OF_MONTH));

    currentDate.setTimeInMillis(1234567898765L);
    System.out.println("Current year: " + currentDate.get(GregorianCalendar.YEAR));
    System.out.println("Current year: " + currentDate.get(GregorianCalendar.MONTH));
    System.out.println("Current year: " + currentDate.get(GregorianCalendar.DAY_OF_MONTH));

  }
}
