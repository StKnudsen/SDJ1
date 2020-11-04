import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grades;

  public GradeList()
  {
    grades = new ArrayList<>();
  }

  public int getNumberOfGrades()
  {
    return grades.size();
  }

  public Grade[] getAllGrades()
  {
    Grade[] allGrades = new Grade[getNumberOfGrades()];

    for (int i = 0; i < getNumberOfGrades(); i++)
    {
      allGrades[i] = grades.get(i);
    }

    return allGrades;
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
  }

  public double getAverage()
  {
    double sum = 0;

    for (int i = 0; i < getNumberOfGrades(); i++)
    {
      sum += grades.get(i).getGrade();
    }

    return sum / getNumberOfGrades();
  }

  public String toString()
  {
    String s = "";

    for (int i=0; i<getNumberOfGrades(); i++)
    {
      s += "Grade #" + (i+1) + ": " + grades.get(i);
      if (i < getNumberOfGrades()-1)
      {
        s += "\n";
      }
    }

    return s;
  }
}
