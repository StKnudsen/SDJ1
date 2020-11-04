import java.util.ArrayList;
import java.util.Scanner;

/**
 *  For Exercise6_05:
 *  Solve the following exercises from last session,
 *  using an ArrayList instead of an array
 *
 *  Create a program that reads a number of integers from
 *  keyboard and stores them into an array.
 *
 *  Find the second largest value in the
 *  array and print this to the screen.
 */

public class secondLargest
{
  public static void main(String[] args)
  {
    ArrayList<Integer> integers = new ArrayList<>();
    final int NUMBER_OF_INTEGERS = 5;
    Integer high = 0;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < NUMBER_OF_INTEGERS; i++)
    {
      System.out.print("Enter " + (i+1) + " of " + NUMBER_OF_INTEGERS + " integers: ");
      integers.add(scanner.nextInt());
    }

    for (int i = 0; i < 2; i++)
    {
      // remove highest number in integers array
      high = integers.get(0);

      for (Integer integer : integers)
      {
        if (integer > high)
          high = integer;
      }

      // in first run, delete highest number, next iteration
      // will then contain the 'second highest'
      if (i == 0)
        integers.remove(high);
    }

    System.out.println("The second highest number you entered was: " + high);
  }
}
