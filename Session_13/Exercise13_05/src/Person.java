public class Person
{
  private String name;
  private String socialSecurityNumber;

  public Person(String name, String socialSecurityNumber)
  {
    this.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getSocialSecurityNumber()
  {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber)
  {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  @Override public String toString()
  {
    return "Person{" + "name='" + name + '\'' + ", socialSecurityNumber='"
        + socialSecurityNumber + '\'' + '}';
  }
}
