public class TestRectangle
{
  public static void main(String[] args)
  {
    // Length and width
    double length = 10.5;
    double width = 5;

    // Create Rectangle.
    Rectangle rectangle = new Rectangle(length, width);

    System.out.println("Length is: " + rectangle.getLength());
    System.out.println("Width is: " + rectangle.getWidth());
    System.out.println("Area is: " + rectangle.getArea());

    length = 10;
    width = 10;

    rectangle.setLength(length);
    rectangle.setWidth(width);

    System.out.println("Length is: " + rectangle.getLength());
    System.out.println("Width is: " + rectangle.getWidth());
    System.out.println("Area is: " + rectangle.getArea());
  }
}
