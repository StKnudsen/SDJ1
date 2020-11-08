import java.util.ArrayList;

public class GradeList
{
  private int indexOfNextAvailableElement;
  ArrayList<Grade> grades;

  public GradeList()
  {
    indexOfNextAvailableElement = 0;
    grades = new ArrayList<>();
  }

  public int getSize()
  {
    return grades.size();
  }

  public Grade getGrade(int index)
  {
    return (Grade) grades.get(index);
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
    indexOfNextAvailableElement++;
  }

  public Grade[] getAllGrades()
  {
    Grade[] gradesArray = new Grade[grades.size()];

    for (int i = 0; i < grades.size(); i++)
    {
      gradesArray[i] = grades.get(i);
    }

    return gradesArray;
  }

  public double getAverage()
  {
    double sum = 0;

    for ( Grade grade : grades )
    {
      sum += grade.getGrade();
    }

    return sum/ grades.size();
  }

  @Override public String toString()
  {
    return "GradeList{" + "indexOfNextAvailableElement="
        + indexOfNextAvailableElement + ", grades=" + grades + '}';
  }
}
