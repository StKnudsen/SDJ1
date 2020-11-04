public class Person
{
  private String name, birthday;

  public Person(String birthday)
  {
    this.name = "No name";
    this.birthday = birthday;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getBirthday()
  {
    return birthday;
  }
}
