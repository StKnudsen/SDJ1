public class Person
{
  private String name;
  private Home home;

  public Person(String name, Home home)
  {
    this.name = name;
    this.home = home;
  }

  public String getHomeInfo()
  {
    return home.getInfo();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }

    Person other = (Person) obj;

    return name.equals(other.name) && home.equals(other.home);
  }

  @Override public String toString()
  {
    return "Person{" + "name='" + name + '\'' + ", home=" + home.getInfo() + '}';
  }
}
