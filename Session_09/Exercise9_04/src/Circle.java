public class Circle
{
  /**
   *  Two instance variables, radius and centerPoint.
   */
  private double radius;
  private Point centerPoint;

  /**
   *  Constructor with two arguments setting both instance variables
   */
  public Circle (double radius, Point centerPoint)
  {
    this.radius = radius;
    this.centerPoint = centerPoint.copy();
  }

  /**
   *  Getters for both instance variables
   */
  public double getRadius()
  {
    return radius;
  }

  public Point getCenterPoint()
  {
    return centerPoint.copy();
  }

  /**
   *  A method getArea returning the area of the circle
   */
  public double getArea()
  {
    return radius*radius * Math.PI;
  }

  /**
   *  A method moveTo(Point centerPoint) that moves the circle
   *  to a new position represented by centerPoint.
   */
  public void moveTo(Point centerPoint)
  {
    this.centerPoint.moveTo(centerPoint.getX(), centerPoint.getY());
  }

  /**
   *  A method toString() that returns a String with the information
   *  of radius and center point of the circle
   */
  public String toString()
  {
    return "Radius of the circle: " + radius + " and center point: " + centerPoint;
  }

  /**
   *  A method equals returning true if the argument to the
   *  method is a Circle object with the same radius and
   *  center point– otherwise returns false.
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Circle))
    {
      return false;
    }
    Circle other = (Circle) obj;

    return radius == other.radius && centerPoint.equals(other.centerPoint);
  }
}
