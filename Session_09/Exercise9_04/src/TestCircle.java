public class TestCircle
{
  public static void main(String[] args)
  {
    Point point = new Point(5, 5);
    Circle circle = new Circle(1, point);

    System.out.println(circle.getRadius());
    System.out.println(circle.getCenterPoint());
    System.out.println(circle.getArea());

    Point newPoint = new Point(10, 10);
    circle.moveTo(newPoint);

    System.out.println(circle);

    Circle newCircle = new Circle(1, newPoint);
    System.out.println(circle.equals(newCircle));
  }
}
