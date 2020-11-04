public class Car
{
  private String colour;
  private String owner;
  private String registrationNumber;

  // Constructor
  public Car(String owner)
  {
    this.colour = "Black";
    this.owner = owner;
    this.registrationNumber = "123";
  }

  public String getColour()
  {
    return colour;
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }

  public String getOwner()
  {
    return owner;
  }

  public void setOwner(String owner)
  {
    this.owner = owner;
  }

  public String getRegistrationNumber()
  {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber)
  {
    this.registrationNumber = registrationNumber;
  }
}
