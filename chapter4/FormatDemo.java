/** Listing 4.6 Format demo   */
public class FormatDemo {
  public static void main(String[] args) {
    // Display the header of the table
    System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",
           "Degrees", "Radians", "Sine", "Cosine", "Tangent");

    // Display values for 30 degrees
    int degrees = 30;
    double radians = Math.toRadians(degrees);
    System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",
            degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

    // Display 60 degreesint degrees = 30;
    degrees = 60;
    radians = Math.toRadians(degrees);
    System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",
            degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));


  }
}