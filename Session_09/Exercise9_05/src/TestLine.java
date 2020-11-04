public class TestLine
{
  public static void main(String[] args)
  {
    Point pointA = new Point(3, 1);
    Point pointB = new Point(7, 4);
    Line line = new Line(pointA, pointB, "red");
    Line otherLine = new Line(pointA, pointB, "red");

    System.out.println(line);
    System.out.println(line.equals(otherLine));

    System.out.println(line.getSlope());
    System.out.println(line.getYIntercept());
    System.out.println(line.getSlopeIntercept());

    System.out.println(line.equalSlopeIntercept(otherLine));
  }
}
