import java.util.Scanner;

public class TryCatchIntegers
{
  public static void main(String[] args)
  {
    int index = 0;
    int[] integers = new int[5];

    Scanner input = new Scanner(System.in);

    while (index < 5)
    {
      int integer = 0;

      try
      {
        System.out.print("Type an integer in the range 10-99: ");
        integer = Integer.parseInt(input.nextLine());
        if (integer >= 10 && integer <= 99)
        {
          integers[index] = integer;
          index++;
        }
        else
        {
          System.out.println("The input is not an integer in the range 10-99, try again");
        }
      }
      catch (java.util.InputMismatchException e)
      {
        System.out.println("The input is not an integer in the range 10-99, try again");
      }
      catch (Exception e)
      {
        System.out.println("The input is not an integer in the range 10-99, try again");
      }
    }

    System.out.println("Program successfully ended");
  }
}
