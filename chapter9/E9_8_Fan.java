

public class E9_8_Fan {
  public static void main(String[] args) {

    Fan myFan1 = new Fan();
    Fan myFan2 = new Fan();

    myFan1.setSpeed(3);
    myFan1.setRadius(10);
    myFan1.setColor("yellow");
    myFan1.setOn(true);

    myFan2.setSpeed(2);
    myFan2.setRadius(5);
    myFan2.setColor("blue");
    myFan2.setOn(false);

    System.out.println(myFan1.toString());
    System.out.println(myFan2.toString());

  }
}

class Fan {
  final private static int SLOW = 1;
  final private static int MEDIUM = 2;
  final private static int FAST = 3;

  private int speed = SLOW;
  private boolean on = false;
  private double radius = 5;
  private String color = "blue";

  // None argument constructor
  Fan() {

  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  }

  public boolean getOn() {
    return this.on;
  }

  public  void setOn(boolean status) {
    this.on = status;
  }

  public  double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    String fanDescription;
    boolean status = this.getOn();

    if(status) {
      fanDescription = "The fan is on and the speed is " + this.getSpeed() + ", the color is " +
                       this.getColor() + ", the radius is " + this.getRadius();
     }
     else {
       fanDescription = "The fan is not on, the color is " +
                        this.getColor() + ", the radius is " + this.getRadius();
     }
     return fanDescription;
  }
}
