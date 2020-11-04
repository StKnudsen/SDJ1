public class Person
{
  private String name, address;
  private MyDate birthday;
  private Brain brain;

  public Person(String name, String address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    this.brain = new Brain();
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    this.brain = new Brain();
  }

  public Person(MyDate birthday)
  {
    this.name = "No Name";
    this.birthday = birthday.copy();
    this.brain = new Brain();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public MyDate getBirthday()
  {
    return birthday.copy();
  }

  public int getAge()
  {
    return birthday.yearsBetween(MyDate.now());
  }

  public int getIQ()
  {
    return brain.getIQ();
  }

  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }

  public void rememberThis(String topic)
  {
    brain.remember(topic);
  }

  public String whatAreYouThinkingAbout()
  {
    return brain.toString();
  }

  @Override public String toString()
  {
    return "Person{" + "name='" + name + '\'' + ", address='" + address + '\''
        + ", birthday=" + birthday + ", brain=" + brain + '}';
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
      return false;

    Person compare = (Person) obj;

    return name == compare.name && address == compare.address && birthday.equals(compare.birthday) && brain.equals(compare.brain);
  }
}
