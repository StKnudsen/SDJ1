import java.util.Scanner;

public class TestGradeList
{
  public static void main(String[] args)
  {
    GradeList grades = new GradeList();
    int NUMBER_OF_CLASSES = 4;

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < NUMBER_OF_CLASSES; i++)
    {
      boolean gradeSet = false;
      String className;
      Grade classGrade;
      int grade;

      System.out.print("Enter class " + (i+1) + " of " + NUMBER_OF_CLASSES + ": ");
      className = input.nextLine();

      while (!gradeSet)
      {
        try
        {
          System.out.print("Type in the grade for " + className + ": ");
          grade = input.nextInt();
          input.nextLine();

          classGrade = new Grade(className, grade);
          grades.addGrade(classGrade);

          gradeSet = true;
        }
        catch (IllegalArgumentException e)
        {
          System.out.println("Invalid grade, must be -3, 0, 2, 4, 7, 10 or 12, try again.");
        }
        catch (Exception e)
        {
          //
        }
      }
    }

    System.out.println(grades);
  }
}
