public class E9_9_Polygon {
  public static void main(String[] args) {

    Polygon P1 = new Polygon();
    Polygon P2 = new Polygon(6, 4);
    Polygon P3 = new Polygon(10, 4, 5.6, 7.8);

    System.out.println(P1.getPerimeter());
    System.out.println(P1.getArea());
    System.out.println(P2.getPerimeter());
    System.out.println(P2.getArea());
    System.out.println(P3.getPerimeter());
    System.out.println(P3.getArea());
  }
}

class Polygon {
  private int n = 3;
  private double side = 1;
  private double x = 0;
  private double y = 0;

  Polygon() {

  }

  Polygon(int n,  double side) {
    this.n = n;
    this.side = side;
  }

  Polygon(int n, double side, double x, double y) {
    this.n = n;
    this.side = side;
    this.x = x;
    this.y = y;
  }

  public int getN() {
    return this.n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public double getSide() {
    return this.side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getX() {
    return this.x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return this.y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getPerimeter() {
    return this.getSide() * this.getN();
  }

  public double getArea() {
    return ((this.getN() * this.getSide() * this.getSide()) /(4 * Math.tan(Math.PI / this.getN())));
  }
}
