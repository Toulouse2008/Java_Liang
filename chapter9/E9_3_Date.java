import java.util.Date;

public class E9_6_Date {
  public static void main(String[] args) {

    Date d1 = new Date(10000);
    Date d2 = new Date(100000);
    Date d3 = new Date(1000000);
    Date d4 = new Date(10000000);
    Date d5 = new Date(100000000);
    Date d6 = new Date(1000000000);
    Date d7 = new Date(10000000000L);
    Date d8 = new Date(100000000000L);
    System.out.println("Time elapse 10000 is" + d1.toString());
    System.out.println("Time elapse 10000 is" + d2.toString());
    System.out.println("Time elapse 10000 is" + d3.toString());
    System.out.println("Time elapse 10000 is" + d4.toString());
    System.out.println("Time elapse 10000 is" + d5.toString());
    System.out.println("Time elapse 10000 is" + d6.toString());
    System.out.println("Time elapse 10000 is" + d7.toString());
    System.out.println("Time elapse 10000 is" + d8.toString());
    System.out.println("Time elapse 10000 is" + d1.toString());

  }
}
