public class TestHouse
{
  public static void main(String[] args)
  {
    House h1 = new House("Street 1", 500000);
    House h2 = new House("Street 3", 550000);
    Apartment a1 = new Apartment("Street 2, A", 250);
    Apartment a2 = new Apartment("Street 2, B", 280);
    Person p1 = new Person("John Doe", h1);
    Person p2 = new Person("Jane Doe", a1);
    Person p3 = new Person("Jack Black", h2);
    Person p4 = new Person("Jane Doe", a1);
    Person p5 = new Person("Jack Black", h2);

    System.out.println(p1.getHomeInfo());
    System.out.println(p2.getHomeInfo());
    System.out.println(p3.getHomeInfo());

    System.out.println(p2.equals(p4));
    System.out.println(p5.equals(p3));
    System.out.println(p1.equals(p3));
  }
}
