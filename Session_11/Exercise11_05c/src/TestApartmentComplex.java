public class TestApartmentComplex
{
  public static void main(String[] args)
  {
    Tenant tenant1 = new Tenant("John Doe");
    Tenant tenant2 = new Tenant("Jane Doe");

    Apartment apartment1 = new Apartment(1);
    Apartment apartment2 = new Apartment(2);
    Apartment apartment3 = new Apartment(3);

    ApartmentComplex complex = new ApartmentComplex("Don't panic");

    complex.add(apartment1);
    complex.add(apartment2);
    complex.add(apartment3);

    apartment1.rentTo(tenant1, MyDate.now());
    apartment2.rentTo(tenant2, MyDate.now());

    System.out.println(complex.getApartment(1));
    System.out.println(complex.getApartmentByNumber(1));
    System.out.println(complex.getApartmentByTenant(tenant1));
    System.out.println(complex.getFirstAvailableApartment());

    System.out.println(complex);
  }
}
