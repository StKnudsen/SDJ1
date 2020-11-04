public class TestTenant
{
  public static void main(String[] args)
  {
    Tenant tenant = new Tenant("John Doe");

    tenant.setRentedFrom(MyDate.now());

    System.out.println(tenant.getRentedFrom());
    System.out.println(tenant.getName());
    System.out.println(tenant);
  }
}
