public class Person
{
  /**
   *  The class Person has:
   *
   *  Two instance variables, name and birthday
   */
  private String name;
  private MyDate birthday;

  /**
   *  Two constructors, one two-argument constructor setting both
   *  instance variables to values given as argument.
   */
  public Person (String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  /**
   *   A one-argument constructor taking birthday as only
   *   argument. Initialise the name to a proper value
   *   in this one-argument constructor
   */
  public Person (MyDate birthday)
  {
    this.birthday = birthday;
    this.name = "No Name";
  }

  /**
   *  Set method for name
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   *  Get methods for both instance variables
   */
  public String getName()
  {
    return name;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  /**
   *
   */
  public int getAge()
  {
    return birthday.yearsBetween(MyDate.now());
  }

  /**
   *  A method toString() returning a String containing name and birthday
   */
  public String toString()
  {
    return name + " " + birthday;
  }

  /**
   *  A method equals returning true if the object passed as argument
   *  is a Person with the same name and birthday as the
   *  calling object. Otherwise return false.
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
      return false;

    Person compare = (Person) obj;

    return name.equals(compare.name) && birthday.equals(compare.birthday);
  }
}
