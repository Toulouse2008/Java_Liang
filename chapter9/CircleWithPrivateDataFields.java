/** Circle with private data fields combined listing 9.8 and 9.9 */

public class CircleWithPrivateDataFields{
  // Data fields
  // The radius of the circle
  private double radius = 1;

  // The number of objects created
  private static int numberOfObjects = 0;

  // Main method
  public static void main(String[] args){
    // Create a circle with radius 5.0
    CircleWithPrivateDataFields  myCircle =
        new CircleWithPrivateDataFields(5.0);
    System.out.println("The area of the circle of radius " +
        myCircle.getRadius() + " is " + myCircle.getArea());
    // Increase myCircle's radius by 10%
    myCircle.setRadius(myCircle.getRadius() * 1.1);
    System.out.println("The area of the circle of radius " +
        myCircle.getRadius() + " is " + myCircle.getArea());

    System.out.println("The number of objects created is " +
        CircleWithPrivateDataFields.getNumberOfObjects());
  }

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
