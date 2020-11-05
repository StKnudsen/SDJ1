public class Car extends Vehicle
{
  private String regNo;

  public Car(String theOwner, double thePrice, String regNo)
  {
    super(theOwner, thePrice);
    this.regNo = regNo;
  }

  public String getRegNo()
  {
    return regNo;
  }

  public void setRegNo(String regNo)
  {
    this.regNo = regNo;
  }

  @Override public String toString()
  {
    return super.toString() + " Car{" + "regNo='" + regNo + '\'' + '}';
  }

  public boolean equals(Object arg)
  {
    if (!(arg instanceof Car))
    {
      return false;
    }

    Car other = (Car) arg;

    return super.equals(other) && regNo.equals(other.regNo);
  }
}
