public class Service
{
  private int mileage;
  private MyDate date;

  public Service(int mileage, MyDate date)
  {
    this.mileage = mileage;
    this.date = date.copy();
  }

  public int getMileage()
  {
    return mileage;
  }

  public MyDate getDate()
  {
    return date.copy();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Service))
      return false;

    Service other = (Service) obj;

    return date.equals(other.date) && mileage == other.mileage;
  }

  @Override public String toString()
  {
    return "Service{" + "mileage=" + mileage + ", date=" + date + "} \n";
  }
}
