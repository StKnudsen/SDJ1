public class Football extends Ball
{
  public Football(int suitableAge, int diameter)
  {
    super(suitableAge, diameter);
  }

  public String play()
  {
    return "Kick";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Football))
    {
      return false;
    }

    Football other = (Football) obj;

    return super.equals(other);
  }

  @Override public String toString()
  {
    return super.toString();
  }
}
