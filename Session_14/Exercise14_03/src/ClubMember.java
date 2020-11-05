public abstract class ClubMember
{
  private String name;
  private int age;

  public ClubMember(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public String toString()
  {
    return "Club member " + name + " is " + age + " years old.";
  }

  public abstract double getMembershipFee();
}
