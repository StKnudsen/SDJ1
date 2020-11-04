public class TestName
{
  public static void main(String[] args)
  {
    Name name1 = new Name("Jack Black");

    System.out.println(name1.getFirstName());
    System.out.println(name1.getLastName());
    System.out.println(name1.getFullName());
    System.out.println(name1.getFormalName());

    Name name2 = new Name("Donald", "Duck");
    System.out.println(name2.getFullName());


    Name name3 = new Name("Chuck", "Norris");

    System.out.println(name3);
  }
}
