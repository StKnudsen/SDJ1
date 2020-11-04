public class Job
{
  /**
   *  Three instance variables, a job title, a monthly salary and an
   *  employee, name them title, salary and employee where title
   *  should be of type String, salary of type double and
   *  employee of type Person.
   */
  private String title;
  private double salary;
  private Person employee;

  /**
   *  A 3-argument constructor setting all three instance variables.
   *  DON’T make a copy of the Person object. Why?
   *  (Hint: Look at the arrows in UML)
   */
  public Job(String title, double salary, Person employee)
  {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }

  /**
   *  A 2-argument constructor with job title and
   *  salary as argument. Set the employee to null.
   */
  public Job(String title, double salary)
  {
    this.title = title;
    this.salary = salary;
    this.employee = null;
  }

  /**
   *  Getters for all instance variables
   */
  public String getTitle()
  {
    return title;
  }

  public double getSalary()
  {
    return salary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  /**
   *  A method setSalary returning the salary
   *
   *  Probably meant to set salary, not return.
   */
  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  /**
   *  A method isAvailable returning true if
   *  no employees are set (employee is null)
   *  otherwise returning false.
   */
  public boolean isAvailable()
  {
    return employee == null ? true : false;
  }

  /**
   *  A method hire (a set method for employee) setting
   *  the employee given as argument to the employee of
   *  the job – but only if the job is available,
   *  ie. if employee is null.
   */
  public void hire(Person employee)
  {
    if (this.employee == null)
      this.employee = employee;
  }

  /**
   *  A method fire removing the employee of the
   *  job (setting it to null).
   */
  public void fire()
  {
    employee = null;
  }

  /**
   *  A method toString returning all information in a String
   */
  public String toString()
  {
    if (employee == null)
      return "no employee";
    return employee.getName() + " with title: " + title + ", and salary: " + salary;
  }

  /**
   *  A method equals returning true if the argument to the
   *  method is a Job object with the same title, salary
   *  and employee – otherwise returns false.
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Job))
      return false;

    Job compare = (Job) obj;

    return title.equals(compare.title) && salary == compare.salary && employee.equals(compare.employee);
  }
}
