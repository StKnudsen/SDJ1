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

  public boolean equals(Object obj)
  {
    if (!(obj instanceof House))
    {
      return false;
    }

    House other = (House) obj;

    return getAddress().equals(other.getAddress()) && price == other.price;
  }

  @Override public String toString()
  {
    return "House{" + "price=" + price + '}';
  }
}
