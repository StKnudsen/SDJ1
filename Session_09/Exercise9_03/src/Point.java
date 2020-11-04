public class Point
{
  /**
   *  Two instance variables x and y both of type double.
   */
  private double x, y;

  /**
   *  Constructor with two arguments setting both x and y
   */
  public Point (double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  /**
   *  Getters for both instance variables
   */
  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  /**
   *  A method moveTo(double newX, double newY)
   *  that moves the point (x,y) to a new
   *  position represented by (newX, newY) // bah
   */
  public void moveTo(double x, double y){
    this.x = x;
    this.y = y;
  }

  /**
   *  A method move(double xDistance, double yDistance)
   *  that moves the point (x,y) to the position
   *  (x + xDistance, y + yDistance)
   */
  public void move(double x, double y){
    this.x += x;
    this.y += y;
  }

  /**
   *  A method copy returning a Point object
   *  with the same x and y values
   */
  public Point copy()
  {
    return new Point(x, y);
  }

  /**
   *  A method toString that returns a String
   *  with the point in the format "(x,y)".
   *  Example: calling the toString-method for a
   *  point with x=3 and y=4 returns  "(3, 4)"
   */
  public String toString()
  {
    return "(" + x + ", " + y + ")";
  }

  /**
   *  A method equals returning true if the argument
   *  to the method is a Point object with
   *  the same x and y coordinates –
   *  otherwise returns false.
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Point))
      return false;

    Point compare = (Point) obj;

    return x == compare.x && y == compare.y;
  }
}
