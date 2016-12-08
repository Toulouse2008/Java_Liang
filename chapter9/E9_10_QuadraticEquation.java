import java.util.Scanner;

public class E9_10_QuadraticEquation {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a, b, and c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    QuadraticEquation equation = new QuadraticEquation(a, b, c);

    System.out.println(equation.getRoot1());
    System.out.println(equation.getRoot2());
  }
}

class QuadraticEquation {
  private double a, b, c;

  QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA() {
    return this.a;
  }

  public double getB() {
    return this.b;
  }

  public double getC() {
    return this.c;
  }

  public double getDiscriminant() {
    return (this.getB() * this.getB() - 4 * this.getA() * this.getC());
  }

  public double getRoot1() {
    double discriminant = this.getDiscriminant();
    if(discriminant >= 0)
      return (-b + Math.sqrt(discriminant)) / (2 * this.getA());
    else
      return 0;
  }

  public double getRoot2() {
    double discriminant = this.getDiscriminant();
    if(discriminant > 0)
      return (-b - Math.sqrt(discriminant)) / (2 * this.getA());
    else
      return 0;
  }
}
