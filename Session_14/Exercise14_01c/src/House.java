public class House extends Home
{
  private double price;

  public House(String address, double price)
  {
    super(address);
    this.price = price;
  }

  public String getInfo()
  {
    return getAddress() + " costs: $" + price;
  }
}
