import java.util.Scanner;

/**
 *  The program must read input from the user. The user must input a grade in the 7-scale
 *  format (-3, 00, 02, 4, 7, 10, 12). The input will likely be in the format of
 *  int. The program should convert the input to the corresponding grade on
 *  the ECTS scale (A, B, C, D, E, Fx, F) and display it.
 *  (Note: The solution should use if-statements)
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

    if (grade == -3)
    {
      ects = "F";
    }
    else if (grade == 0)
    {
      ects = "Fx";
    }
    else if (grade == 2)
    {
      ects = "E";
    }
    else if (grade == 4)
    {
      ects = "D";
    }
    else if (grade == 7)
    {
      ects = "C";
    }
    else if (grade == 10)
    {
      ects = "B";
    }
    else if (grade == 12)
    {
      ects = "A";
    }
    else
    {
      validInput = false;
    }

    if (validInput)
    {
      System.out.println("The grade " + grade + " is equal to " + ects + " on the ECTS scale.");
    }
    else
    {
      System.out.println("That is not a valid 7-scale input");
    }
  }
}
