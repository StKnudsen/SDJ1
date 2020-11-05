public abstract class Toy
{
  private int suitableAge;

  public Toy(int suitableAge)
  {
    this.suitableAge = suitableAge;
  }

  public abstract String play();

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Toy))
    {
      return false;
    }

    Toy other = (Toy) obj;

    return suitableAge == other.suitableAge;
  }

  public abstract String toString();
}
