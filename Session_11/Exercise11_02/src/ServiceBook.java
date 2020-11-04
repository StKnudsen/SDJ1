import java.util.ArrayList;

public class ServiceBook
{
  private ArrayList<Service> book;

  public ServiceBook()
  {
    book = new ArrayList<>();
  }

  public void addService(Service service)
  {
    book.add(service);
  }

  public int getNumberOfServices()
  {
    return book.size();
  }

  public Service getService(int index)
  {
    return book.get(index);
  }

  public Service[] getAllServices()
  {
    Service[] services = new Service[getNumberOfServices()];

    for (int i = 0; i < services.length; i++)
    {
      services[i] = book.get(i);
    }

    return services;
  }

  public int[] getAllServiceMileages()
  {
    int[] allMileages = new int[getNumberOfServices()];

    for (int i = 0; i < allMileages.length; i++)
    {
      allMileages[i] = book.get(i).getMileage();
    }

    return allMileages;
  }

  public boolean hasServiceOnDate(MyDate date)
  {
    for (Service service:book)
    {
      if (service.getDate().equals(date))
        return true;
    }

    return false;
  }

  public MyDate getDateOfLastService()
  {
    return book.get(getNumberOfServices() -1).getDate();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ServiceBook))
      return false;

    ServiceBook other = (ServiceBook) obj;

    return book.equals(other.book);
  }

  @Override public String toString()
  {
    return "ServiceBook{" + "\n book=" + book + "}";
  }
}
