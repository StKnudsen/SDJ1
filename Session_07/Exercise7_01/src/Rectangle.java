public class Rectangle
{
  private double length;
  private double width;

  /* Constructor */
  public Rectangle(double length, double width)
  {
    this.length = length;
    this.width = width;
  }

  /* Setters */
  public void setLength(double length)
  {
    this.length = length;
  }

  public void setWidth(double width)
  {
    this.width = width;
  }

  /* Getters */
  public double getLength()
  {
    return length;
  }

  public double getWidth()
  {
    return width;
  }

  /*
   *  The getArea returns the value of length times width.
   */
  public double getArea()
  {
    return this.length * this.width;
  }
}
