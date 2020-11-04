public class TestPerson
{
  public static void main(String[] args)
  {
    String name = "No name";
    String birthday = "Friday";

    Person person = new Person(birthday);

    person.setName(name);

    System.out.println("Hello " + person.getName() + "!");
    System.out.println("You birthday is: " + person.getBirthday());
  }
}
