import java.util.Scanner;

public class E9_11_LinearEquations {
  public static void main(String[] args) {

    System.out.println("Enter a, b, c, d, e and f: ");
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();

    LinearEquations myEquations = new LinearEquations(a, b, c, d, e, f);

    System.out.println(myEquations.getX());
    System.out.println(myEquations.getY());


  }
}

class LinearEquations {
  private double a, b, c, d, e, f;

  LinearEquations(double a, double b, double c, double d, double e, double f) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;
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

  public double getD() {
    return this.d;
  }

  public double getE() {
    return this.e;
  }

  public double getF() {
    return this.f;
  }

  public boolean isSolvable() {
    boolean sovable = false;
    if (this.getA()* this.getD() - this.getB() * this.getC() != 0)
      sovable = true;
    return sovable;
  }

  public double getX() {
    if (this.isSolvable())
      return ((this.getE() * this.getD() - this.getB() * this.getF()) / (this.getA() * this.getD() - this.getB() * this.getC()));
    else {
      System.out.println("The equation has no solution");
      return 0;
    }
  }

  public double getY() {
    if (this.isSolvable())
      return ((this.getA() * this.getF() - this.getE() * this.getC()) / (this.getA() * this.getD() - this.getB() * this.getC()));
    else {
      System.out.println("The equation has no solution");
      return 0;
    }
  }
}
