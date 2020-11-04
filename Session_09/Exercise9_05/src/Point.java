public class Point
{
  private double x, y;

  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public void moveTo(double x, double y){
    this.x = x;
    this.y = y;
  }

  public void move(double x, double y){
    this.x += x;
    this.y += y;
  }

  public Point copy()
  {
    return new Point(x, y);
  }

  public String toString()
  {
    return "(" + x + ", " + y + ")";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Point))
      return false;

    Point compare = (Point) obj;

    return x == compare.x && y == compare.y;
  }
}
