public class Car
{
  private String registrationNumber;
  private int mileage;
  private ServiceBook serviceBook;

  public Car(String registrationNumber, int mileage)
  {
    this.registrationNumber = registrationNumber;
    this.mileage = mileage;
    this.serviceBook = new ServiceBook();
  }

  public int getMileage()
  {
    return mileage;
  }

  public String getRegistrationNumber()
  {
    return registrationNumber;
  }

  public ServiceBook getServiceBook()
  {
    return serviceBook;
  }

  public void setRegistrationNumber(String registrationNumber)
  {
    this.registrationNumber = registrationNumber;
  }

  public void drive(int mileage)
  {
    this.mileage += mileage;
  }

  public void service()
  {
    Service service = new Service(mileage, MyDate.now());

    serviceBook.addService(service);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
      return false;

    Car compare = (Car) obj;

    return registrationNumber.equals(compare.registrationNumber) && mileage == compare.mileage;
  }

  @Override public String toString()
  {
    return "Car{" + "registrationNumber='" + registrationNumber + '\''
        + ", mileage=" + mileage + "\n" + serviceBook + "}";
  }
}
