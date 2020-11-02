import java.util.Scanner;

/**
 *  Rework your solution to exercise 3.01 so that
 *  it uses a switch instead of if-statements.
 */

public class GradeConversion
{
  public static void main(String[] args)
  {
    int grade;
    boolean validInput = true;
    String ects = "";

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the 7-scale grade: ");
    grade = input.nextInt();

    switch (grade)
    {
      case -3:
        ects = "F";
        break;
      case 0:
        ects = "Fx";
        break;
      case 2:
        ects = "E";
        break;
      case 4:
        ects = "D";
        break;
      case 7:
        ects = "C";
        break;
      case 10:
        ects = "B";
        break;
      case 12:
        ects = "A";
        break;
      default:
        ects = "That is not a valid 7-scale input";
    }

    System.out.println("The grade " + grade + " is equal to " + ects + " on the ECTS scale.");
  }
}
