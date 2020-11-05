public class TestJobBase
{
  public static void main(String[] args)
  {
    Secretary secretary = new Secretary("John Doe", "123", 25, 4);
    Teacher teacher = new Teacher("Jane Doe", "234", 12.5,2);
    Student student1 = new Student("Jack Black", "345", false);
    Student student2 = new Student("Jill Black", "456", true);

    JobBase jobBase = new JobBase();

    jobBase.addPerson(secretary);
    jobBase.addPerson(teacher);
    jobBase.addPerson(student1);
    jobBase.addPerson(student2);

    System.out.println(jobBase);

    jobBase.removePerson(student1);

    System.out.println(jobBase);
  }
}
