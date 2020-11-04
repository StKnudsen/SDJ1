public class TestPerson
{
  public static void main(String[] args)
  {
    MyDate birthday = new MyDate(21, 8,2000);

    Person person = new Person("John Doe", birthday);
    Person clone = new Person("John Doe", birthday);

    System.out.println("person name " + person.getName() + " age " + person.getAge());
    System.out.println("person iq: " + person.getIQ());
    System.out.println("brain damaged: " + person.isBrainDamaged());

    person.rememberThis("Hello world.");
    person.rememberThis("Here i come.");
    person.rememberThis("so long and thanks for all the fish.");

    System.out.println("person iq: " + person.getIQ());
    System.out.println("is thinking about: " + person.whatAreYouThinkingAbout());

    System.out.println(person.doYouRemember("Hello world."));

    System.out.println(person.equals(clone));

    clone.rememberThis("Hello world.");
    clone.rememberThis("Here i come.");
    clone.rememberThis("so long and thanks for all the fish.");
    System.out.println(person.equals(clone));

    clone.rememberThis(null);
    System.out.println("brain damaged: " + clone.isBrainDamaged());
  }
}
