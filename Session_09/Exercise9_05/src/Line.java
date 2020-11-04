public class Line
{
  private Point pointA;
  private Point pointB;
  private String colour;

  public Line(Point pointA, Point pointB, String colour)
  {
    this.pointA = pointA.copy();
    this.pointB = pointB.copy();
    this.colour = colour;
  }

  public Line(Point pointA, Point pointB)
  {
    this.pointA = pointA.copy();
    this.pointB = pointB.copy();
    colour = "black";
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }

  public String getColour()
  {
    return colour;
  }

  public void setPointA(Point point)
  {
    pointA = point.copy();
  }

  public void setPointB(Point point)
  {
    pointB = point.copy();
  }

  public Point getPointA()
  {
    return pointA;
  }

  public Point getPointB()
  {
    return pointB;
  }

  public double getLength()
  {
    return Math.sqrt((Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2)));
  }

  public String toString()
  {
    return "A " + colour + " line from " + pointA + " to " + pointB + " with length equal to " + getLength();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Line))
    {
      return false;
    }

    Line other = (Line) obj;

    return colour.equals(other.colour) && pointA.equals(other.pointA) && pointB.equals(other.pointB);
  }

  public double getSlope()
  {
    return (pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX());
  }

  public double getYIntercept()
  {
    return pointA.getY() + getSlope() + pointA.getX();
  }

  public String getSlopeIntercept()
  {
    return "y = " + getSlope() + " x = " + getYIntercept();
  }

  public boolean equalSlopeIntercept(Line other)
  {
    if (!(other instanceof Line))
    {
      return false;
    }

    Line line = (Line) other;

    return getSlopeIntercept().equals(line.getSlopeIntercept());
  }
}
