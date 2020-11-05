public class Van extends Car
{
  private int maxLoad;

  public Van(String theOwner, double thePrice, String regNo, int maxLoad)
  {
    super(theOwner, thePrice, regNo);
    this.maxLoad = maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  @Override public String toString()
  {
    return super.toString() + " Van{" + "maxLoad=" + maxLoad + '}';
  }

  public boolean equals(Object arg)
  {
    if (!(arg instanceof Van))
    {
      return false;
    }

    Van other = (Van) arg;

    return super.equals(other) && maxLoad == other.maxLoad;
  }
}
