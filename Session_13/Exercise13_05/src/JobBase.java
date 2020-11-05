import java.util.ArrayList;

public class JobBase
{
  private ArrayList<Person> people;

  public JobBase()
  {
    people = new ArrayList<>();
  }

  public void addPerson(Person person)
  {
    people.add(person);
  }

  public void removePerson(Person person)
  {
    people.remove(person);
  }

  @Override public String toString()
  {
    String s = "";

    for (Person person:people)
    {
      s += person.toString() + "\n";
    }

    return s;
  }
}
