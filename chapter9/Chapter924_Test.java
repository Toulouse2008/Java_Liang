/** 9.24 Show the output of the following program */

public class Chapter924_Test {
  public static void main(String[] args) {

    // Create two circle objects
    Circle circle1 = new Circle(1);
    Circle circle2 = new Circle(2);

    // Ivoke swap1 method and output results
    swap1(circle1, circle2);
    System.out.println("After swap1: circle1 = " +
    circle1.radius + " circle2 = " + circle2.radius);

    // Ivoke swap1 method and output results
    swap2(circle1, circle2);
    System.out.println("After swap2: circle1 = " +
    circle1.radius + " circle2 = " + circle2.radius);
  }

  // Define the swap1 method
  public static void swap1(Circle x, Circle y) {
    Circle temp = x;
    x = y;
    y = temp;
}

  // Define the swap2 method
  public static void swap2(Circle x, Circle y) {
    double temp = x.radius;
    x.radius = y.radius;
    y.radius = temp;
  }
}

/** Define class circle  */
class Circle {

  double radius;

  // Constructor
  Circle(double newRadius) {
    radius = newRadius;
  }
}
