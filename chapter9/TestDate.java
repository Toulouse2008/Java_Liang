/** Exercise 9.2 Date objects */
import java.util.Date;

public class TestDate{

  public static void main(String[] args){

    Date date1 = new Date(10000);
    System.out.println(date1.toString());

    date1.setTime(100000);
    
    System.out.println(date1.toString());

    date1.setTime(1000000);
    
    System.out.println(date1.toString());

    date1.setTime(10000000);
    
    System.out.println(date1.toString());

    date1.setTime(100000000000L);
    
    System.out.println(date1.toString());
    date1.setTime(1000000000000000000L);
    
    
    System.out.println(date1.toString());
  }
}
