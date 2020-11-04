public class TestPoint
{
  public static void main(String[] args)
  {
    Point point = new Point(5,10);
    System.out.println(point);

    point.moveTo(10, 20);
    System.out.println(point);

    point.move(2,4);
    System.out.println(point);

    Point point2 = new Point(12, 24);

    System.out.println(point.equals(point2));
  }
}
