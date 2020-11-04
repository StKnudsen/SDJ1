public class Guest
{
  private String name;

  public Guest(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Guest))
      return false;

    Guest compare = (Guest) obj;

    return this.name.equals(compare.name);
  }

  public String toString()
  {
    return name;
  }
}
