public class TestApartmentComplex
{
  public static void main(String[] args)
  {
    Tenant tenant = new Tenant("John Doe");
    Apartment apartment = new Apartment(42);
    ApartmentComplex complex = new ApartmentComplex("No Where.. 42");

    complex.add(apartment);

    System.out.println(complex.getNumberOfApartments());
    System.out.println(complex.getFirstAvailableApartment().getNumber());
    System.out.println(complex.getApartment(0).getNumber());
    System.out.println(complex.getApartmentByNumber(42).getNumber());

    apartment.rentTo(tenant, MyDate.now());

    System.out.println(complex.getApartmentByTenant(tenant));

    System.out.println(complex);

  }
}
