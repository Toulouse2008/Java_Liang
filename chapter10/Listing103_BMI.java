/** Listing 10.3 BMI class */

public class Listing103_BMI {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI()
           + " " + bmi1.getStatus());

    // Create second object bmil
    BMI bmi2 = new BMI("Susan, King", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() +
           " " + bmi2.getStatus());
  }
}

/** Define BMI class */
class BMI {
  private String name;
  private int age;
  private double weight;  // in pounds
  private double height;  // in inches
  public static final double KILO_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;

  // Constructor BMI
  public BMI(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  // Constructor with Default value for weight
  public BMI(String name, double weight, double height) {
    this(name, 20, weight, height);
  }

  // get BMI
  public double getBMI() {
    double bmi = weight * KILO_PER_POUND / ((height * METERS_PER_INCH) *
                 (height * METERS_PER_INCH));
    return Math.round(bmi * 100) / 100.0;
  }

  // Get the body status
  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweigth";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }

  // get the name
  public String getName() {
    return name;
  }

  // get age
  public int getAge() {
    return age;
  }

  // get weight
  public double getWeight() {
    return weight;
  }

  // get height
  public double getHeight() {
    return height;
  }
}
