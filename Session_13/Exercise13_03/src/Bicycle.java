public class Bicycle extends Vehicle
{
  private int gears;

  public Bicycle(String theOwner, double price, int numberOfGears)
  {
    super(theOwner, price);
    gears = numberOfGears;
  }

  public int getGears()
  {
    return gears;
  }

  public void setGears(int gears)
  {
    this.gears = gears;
  }

  @Override public String toString()
  {
    return super.toString() + " Bicycle{" + "gears=" + gears + '}';
  }

  public boolean equals(Object arg)
  {
    if (!(arg instanceof Bicycle))
    {
      return false;
    }

    Bicycle other = (Bicycle) arg;

    return super.equals(other) && gears == other.gears;
  }
}
