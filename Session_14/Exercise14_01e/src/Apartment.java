public class Apartment extends Home
{
  private double rent;

  public Apartment(String address, double rent)
  {
    super(address);
    this.rent = rent;
  }

  public String getInfo()
  {
    return getAddress() + " at $" + rent + " per month.";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Apartment))
    {
      return false;
    }

    Apartment other = (Apartment) obj;

    return getAddress().equals(other.getAddress()) && rent == other.rent;
  }

  @Override public String toString()
  {
    return "Apartment{" + "rent=" + rent + '}';
  }
}
