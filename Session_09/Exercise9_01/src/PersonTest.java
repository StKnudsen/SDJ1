public class PersonTest
{
  public static void main(String[] args)
  {
    /**
     *  Implement a test class with a main method in which you test class Person
     */
    MyDate birthday = new MyDate(1, 2, 2000);
    Person person1 = new Person("John Doe", birthday);
    Person person2 = new Person(birthday);

    System.out.println(person1.getName() + " " + person1.getBirthday() + " " + person1.getAge());
    System.out.println(person1 + " && " + person2);
    System.out.println(person1.equals(person2));

    person2.setName("John Doe");
    System.out.println(person1.equals(person2));
  }
}
