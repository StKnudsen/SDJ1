public class JobTest
{
  public static void main(String[] args)
  {
    /**
     *  Create a test class (JobTest) with a main method and test the class Job
     *
     *  Create at least two Job-objects (note you also need Person and MyDate objects)
     *  Call all the methods you made in class Job, i.e. both constructors and all methods
     */

    MyDate birthday1 = new MyDate(2,2,2000);
    MyDate birthday2 = new MyDate(2,2,2002);
    MyDate birthday3 = new MyDate(2,2,2000);

    Person person1 = new Person("John Doe", birthday1);
    Person person2 = new Person("Jane Doe", birthday2);
    Person person3 = new Person("John Doe", birthday3);

    Job job1 = new Job("Floor manager", 125, person1);
    Job job2 = new Job("Floor manager", 105, person2);
    Job job3 = new Job("Floor manager", 125, person3);

    System.out.println(job1.getTitle() + " " + job1.getEmployee().getName() + " " + job1.getSalary());
    System.out.println(job2);

    job1.fire();
    System.out.println("Someone got fired, who is on job1: " + job1);
    System.out.println("Is job1 available? " + job1.isAvailable());
    job1.hire(person1);
    System.out.println(job1);
    System.out.println("Comparing the job1 and job3, equal? " + job1.equals(job3));

    job1.setSalary(250);
    System.out.println(job1);
    System.out.println(job2);
    System.out.println(job3);
  }
}
