public class Grade
{
  private String courseName;
  private int grade;

  public Grade(String courseName, int grade)
  {
    this.courseName = courseName;
    if (isLegalGrade(grade) )
    {
      this.grade = grade;
    }
  }

  private boolean isLegalGrade(int grade) throws IllegalArgumentException
  {
    switch (grade)
    {
      case -3, 0, 2, 4, 7, 10, 12:
        return true;
      default:
        throw new IllegalArgumentException("No matching grade");
    }
  }

  public String getCourseName()
  {
    return courseName;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  public String toString()
  {
    return courseName + " " + grade;
  }
}
