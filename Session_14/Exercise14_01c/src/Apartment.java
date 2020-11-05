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
}
