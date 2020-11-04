public class TestPoint
{
  public static void main(String[] args)
  {
    /**
     *  Implement a test class, TestPoint, with
     *  a main method and test your solution
     */
    Point point = new Point(5,10);
    System.out.println("'point' = " + point);

    point.moveTo(10, 20);
    System.out.println("'point' after moveTo = " + point);

    point.move(2,4);
    System.out.println("'point' after move = " + point);

    Point point2 = new Point(12, 24);
    System.out.println("'point' equals 'point2' = " + point.equals(point2));

    Point point3 = point2.copy();
    System.out.println("'point3' a copy of 'point2' = " +point3);
  }
}
