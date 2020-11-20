import java.util.ArrayList;
import java.util.Scanner;

public class EndToEnd
{
  public static void main(String[] args)
  {
    ArrayList<Integer> integers = new ArrayList<>();
    boolean doAddNumber = true;
    final String endTrigger = "end";
    int sum = 0;

    Scanner input = new Scanner(System.in);

    while (doAddNumber)
    {
      int integer = 0;
      String value;

      try
      {
        System.out.print("Type an integer in the range 10-99: ");
        // if end trigger, update do add number to false, else add integer
        value = input.nextLine();

        if (value.equals(endTrigger))
        {
          doAddNumber = false;
        }
        else
        {
          integer = Integer.parseInt(value);

          if (integer >= 10 && integer <= 99)
          {
            integers.add(integer);
          }
          else
          {
            System.out.println("The input is not an integer in the range 10-99, try again");
          }
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

    for (int number: integers)
    {
      sum += number;
    }


    System.out.println("Program successfully ended, with the end sum: " + sum);
  }
}
