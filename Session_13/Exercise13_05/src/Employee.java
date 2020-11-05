public class Employee extends Person
{
  private double salary;

  public Employee(String name, String socialSecurityNumber, double salary)
  {
    super(name, socialSecurityNumber);
    this.salary = salary;
  }

  public double getSalary()
  {
    return salary;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  @Override public String toString()
  {
    return super.toString() + " Employee{" + "salary=" + salary + '}';
  }
}
