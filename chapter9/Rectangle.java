/** 9.2 p260 Rectangle class  */
public class Rectangle{
  double width = 1.0;
  double height = 1.0;

  // Main method
  public static void main(String[] args){
    // Create default Rectangle
    Rectangle myRectangle1 = new Rectangle();
    System.out.println(myRectangle1.getArea());
    System.out.println(myRectangle1.getPerimeter());


    Rectangle myRectangle2 = new Rectangle(4, 40);
    System.out.println(myRectangle2.getArea());
    System.out.println(myRectangle2.getPerimeter());
    Rectangle myRectangle3 = new Rectangle(3.5, 35.9);
    System.out.println(myRectangle3.getArea());
    System.out.println(myRectangle3.getPerimeter());
  }

  // Constructor with default Data
  Rectangle(){

  }

  // Constructor with created data set
  Rectangle(double newWidth, double newHeight){
    this.width = newWidth;
    this.height = newHeight;
  }

  // Return area
  double getArea(){
    return width * height;
  }

  // Return the perimeter
  double getPerimeter(){
    return (width + height) * 2;
  }
}
