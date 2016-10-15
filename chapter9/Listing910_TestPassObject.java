/** Listing 9.10 Test Pass Object  */

public class Listing910_TestPassObject {
  public static void main(String[] args) {
    CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

    // Print area for radius 1, 2, 3, 4, and 5
    int n = 5;
    printArea(myCircle, n);

    // See myCircle.rediua and times
    System.out.println("\n" + "Radius is " + myCircle.getRadius());
    System.out.println("n is " + n);
  }

  /** Print a table of areas for radius */
  public static void printArea(CircleWithPrivateDataFields c, int times) {
    System.out.println("Radius\t\tArea");
    while(times >= 1) {
      System.out.printf("%5.0f\t\t%5.2f\n", c.getRadius(), c.getArea());
      c.setRadius(c.getRadius() + 1);
      times--;
    }
  }

}

/** Circle with private data fields combined listing 9.8 and 9.9 */
class CircleWithPrivateDataFields {
  // Data fields
  // The radius of the circle
  private double radius = 1;

  // The number of objects created
  private static int numberOfObjects = 0;

  // Construct circle with radius of 1
  public CircleWithPrivateDataFields(){
    numberOfObjects++;
  }

  // Construct a circle with a special radius
  public CircleWithPrivateDataFields(double newRadius){
    radius = newRadius;
    numberOfObjects++;
  }

  // Return radius
  public double getRadius(){
    return radius;
  }

  // Set new radius
  public void setRadius(double newRadius){
    radius = (newRadius >= 0) ? newRadius : 0;
  }

  // Return numberOfObjects
  public static int getNumberOfObjects(){
    return numberOfObjects;
  }

  // Return the area of this circle
  public double getArea(){
    return radius * radius * Math.PI;
  }
}
