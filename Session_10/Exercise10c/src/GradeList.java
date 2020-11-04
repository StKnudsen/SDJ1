public class GradeList
{
  private Grade[] grades;

  public GradeList(int numberOfGrades)
  {
    grades = new Grade[numberOfGrades];
  }

  public int getNumberOfGrades()
  {
    int count = 0;

    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] != null)
        count++;
    }

    return count;
  }

  public Grade getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(Grade grade, int index)
  {
    grades[index] = grade;
  }

  public double getAverage()
  {
    double sum = 0;

    for (int i = 0; i < getNumberOfGrades(); i++)
    {
      sum += grades[i].getGrade();
    }

    return sum / getNumberOfGrades();
  }

  public String toString()
  {
    String s = "";
    for (int i=0; i<getNumberOfGrades(); i++)
    {
      s += "Grade #" + (i+1) + ": " + grades[i];
      if (i < getNumberOfGrades()-1)
      {
        s += "\n";
      }
    }
    return s;
  }
}
