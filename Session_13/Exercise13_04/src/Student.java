public class Student extends Person
{
  private boolean goodStudent;

  public Student(String name, String socialSecurityNumber, boolean goodStudent)
  {
    super(name, socialSecurityNumber);
    this.goodStudent = goodStudent;
  }

  public boolean isGoodStudent()
  {
    return goodStudent;
  }

  public void setGoodStudent(boolean goodStudent)
  {
    this.goodStudent = goodStudent;
  }

  @Override public String toString()
  {
    return super.toString() + " Student{" + "goodStudent=" + goodStudent + '}';
  }
}
