public class Point
{
  private int x, y;

  public Point (int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  public void moveTo(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void move(int x, int y){
    this.x += x;
    this.y += y;
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
