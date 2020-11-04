public class TestTenant
{
  public static void main(String[] args)
  {
    Tenant tenant = new Tenant("John Doe");
    Apartment apartment = new Apartment(42);

    System.out.println(apartment.getNumber());

    System.out.println(apartment.isAvailable());

    apartment.rentTo(tenant, MyDate.now());
    System.out.println(apartment.getTenant());

    System.out.println(apartment);
  }
}
