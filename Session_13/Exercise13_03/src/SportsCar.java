public class SportsCar extends Car
{
  private int maxVelocity;

  public SportsCar(String theOwner, double thePrice, String regNo,
      int maxVelocity)
  {
    super(theOwner, thePrice, regNo);
    this.maxVelocity = maxVelocity;
  }

  public int getMaxVelocity()
  {
    return maxVelocity;
  }

  @Override public String toString()
  {
    return super.toString() + " SportsCar{" + "maxVelocity=" + maxVelocity + '}';
  }

  public boolean equals(Object arg)
  {
    if (!(arg instanceof SportsCar))
    {
      return false;
    }

    SportsCar other = (SportsCar) arg;

    return super.equals(other) && maxVelocity == other.maxVelocity;
  }
}
