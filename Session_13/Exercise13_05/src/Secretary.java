public class Secretary extends Employee
{
  private int numberOfPencils;

  public Secretary(String name, String socialSecurityNumber, double salary,
      int numberOfPencils)
  {
    super(name, socialSecurityNumber, salary);
    this.numberOfPencils = numberOfPencils;
  }

  public int getNumberOfPencils()
  {
    return numberOfPencils;
  }

  public void setNumberOfPencils(int numberOfPencils)
  {
    this.numberOfPencils = numberOfPencils;
  }

  @Override public String toString()
  {
    return super.toString() + " Secretary{" + "numberOfPencils=" + numberOfPencils + '}';
  }
}
