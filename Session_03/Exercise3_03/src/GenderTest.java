import java.util.Scanner;

/**
 *  Modify your code, so that it does the following:
 *  Reads your gender (the same way as in the class shown above – use ‘F’ for female and ‘M’ for male).
 *  Reads your age (of type int).
 *  Displays the following message on the screen:
 *  - “Man” if the age is larger than or equal to 18 and gender is ‘M’
 *  - “Boy” if the age is less than 18 and gender is ‘M’
 *  - “Woman” if the age is larger than or equal to 18 and gender is not ‘M’ (i.e. gender is ‘F’)
 *  - “Girl” if the age is less than 18 and gender is not ‘M’ (i.e. gender is ‘F’)
 */

public class GenderTest
{
  public static void main(String[] args)
  {
    String line, output;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.print("Type gender (M or F): ");
    line = input.nextLine();

    System.out.print("Type age: ");
    age = input.nextInt();

    char gender = line.charAt(0);

    if (gender == 'M')
      output = age < 18 ? "Boy" : "Man";
    else if (gender == 'F')
      output = age < 18 ? "Girl" : "Woman";
    else
      output = "Gender not recognized";

    System.out.println(output);
  }
}
