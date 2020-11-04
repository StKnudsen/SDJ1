import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Solve exercise 5.06 from the last session,
 *  using an ArrayList instead of an array.
 *
 *  Modify your solution, so that the user no longer needs to
 *  input how many elements he wishes to store ahead of time.
 */

public class countNegatives
{
  public static void main(String[] args)
  {
    ArrayList<Integer> integers = new ArrayList<>();
    final int NUMBER_OF_INTEGERS = 5;
    int negative = 0;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < NUMBER_OF_INTEGERS; i++)
    {
      System.out.print("Enter " + ( i + 1 ) + " of " + NUMBER_OF_INTEGERS
          + " integers (both positive and negative): ");
      integers.add(scanner.nextInt());

      if (integers.get(i) < 0)
      {
        negative++;
      }
    }

    System.out.println("The number of negatives are: " + negative);
  }
}
