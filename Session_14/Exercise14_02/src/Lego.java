public class Lego extends Toy
{
  private int numberOfBricks;

  public Lego(int suitableAge, int numberOfBricks)
  {
    super(suitableAge);
    this.numberOfBricks = numberOfBricks;
  }

  public String play()
  {
    return "Build";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Lego))
    {
      return false;
    }

    Lego other = (Lego) obj;

    return super.equals(other) && numberOfBricks == other.numberOfBricks;
  }

  @Override public String toString()
  {
    return "Lego{" + "numberOfBricks=" + numberOfBricks + '}';
  }
}
