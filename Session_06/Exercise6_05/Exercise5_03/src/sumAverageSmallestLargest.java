import java.util.ArrayList;
import java.util.Scanner;

/**
 *  For Exercise6_05:
 *  Solve the following exercises from last session,
 *  using an ArrayList instead of an array
 *
 *  Create a program that uses a loop to read 5 integers from
 *  keyboard and stores them into an array.
 *
 *  Insert some statements after this to calculate the sum,
 *  the average, the smallest and the largest value
 *  and print all this to the screen.
 */

public class sumAverageSmallestLargest
{
  public static void main(String[] args)
  {
    ArrayList<Integer> ints = new ArrayList<>();
    final int NUMBER_OF_INTEGERS = 5;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < NUMBER_OF_INTEGERS; i++)
    {
      System.out.print("Enter " + (i+1) + " of " + NUMBER_OF_INTEGERS + " integer: ");
      ints.add(scanner.nextInt());
    }

    // SUM & AVERAGE
    int total = 0;
    for (Integer value : ints)
    {
      total += value;
    }

    System.out.println("The sum of the integers are: " + total);
    System.out.println("The average is: " + total / NUMBER_OF_INTEGERS);

    // LARGEST VALUE
    int largest = ints.get(0);
    for (Integer value : ints)
    {
      if (value > largest)
        largest = value;
    }

    System.out.println("The biggest number you entered was: " + largest);

    // SMALLEST VALUE
    int lowest = ints.get(0);
    for (Integer value : ints)
    {
      if (value < lowest)
        lowest = value;
    }

    System.out.println("The smallest number you entered was: " + lowest);
  }
}
