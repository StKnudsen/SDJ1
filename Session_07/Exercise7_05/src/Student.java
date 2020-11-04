public class Student
{
  private String name;
  private char gender; // ‘F’ for female or ‘M’ for male
  private int studentNumber;

  public Student(String name, char gender, int studentNumber)
  {
    this.setName(name);
    this.setGender(gender);
    this.setStudentNumber(studentNumber);
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public char getGender()
  {
    return gender;
  }

  public void setGender(char gender)
  {
    this.gender = gender;
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

  public void setStudentNumber(int studentNumber)
  {
    this.studentNumber = studentNumber;
  }

  public String toString()
  {
    return this.name + ", '" + this.gender + "', " + this.studentNumber;
  }
}
