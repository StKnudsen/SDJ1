import java.util.Scanner;

/**
 *  Make a program reading integers from keyboard and keep asking for a
 *  new integer until -1 is typed (sentinel indicating end of data).
 *
 *  At the end print out how many values have been
 *  entered (not including the -1 element).
 */

public class CountIntegers
{
  public static void main(String[] args)
  {
    int counter = 0;
    boolean stillCounting = true;

    Scanner input = new Scanner(System.in);

    while (stillCounting)
    {
      System.out.print("Enter an integer (-1 to exit): ");
      int value = input.nextInt();

      if (value == -1)
      {
        stillCounting = false;
      }
      else
      {
        counter++;
      }
    }

    System.out.println("Amount of integers entered: " + counter);
  }
}
