public class Teacher extends Employee
{
  private int numberOfClasses;

  public Teacher(String name, String socialSecurityNumber, double salary,
      int numberOfClasses)
  {
    super(name, socialSecurityNumber, salary);
    this.numberOfClasses = numberOfClasses;
  }

  public int getNumberOfClasses()
  {
    return numberOfClasses;
  }

  public void setNumberOfClasses(int numberOfClasses)
  {
    this.numberOfClasses = numberOfClasses;
  }

  @Override public String toString()
  {
    return super.toString() + " Teacher{" + "numberOfClasses=" + numberOfClasses + '}';
  }
}
