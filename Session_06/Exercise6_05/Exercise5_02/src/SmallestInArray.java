import java.util.ArrayList;
import java.util.Scanner;

/**
 *  For Exercise6_05:
 *  Solve the following exercises from last session,
 *  using an ArrayList instead of an array
 *
 *  Create a program that uses a loop to read 7 decimal numbers
 *  from keyboard and stores them into an array.
 *
 *  Find the smallest element in the array and print this to the screen.
 */

public class SmallestInArray
{
  public static void main(String[] args)
  {
    ArrayList<Double> doubles = new ArrayList<>();

    final int NUMBER_OF_DOUBLES = 7;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < NUMBER_OF_DOUBLES; i++)
    {
      System.out.print("Enter " + NUMBER_OF_DOUBLES + " decimal numbers: ");
      doubles.add(scanner.nextDouble());
    }

    double lowest = doubles.get(0);
    for (int i = 1; i < NUMBER_OF_DOUBLES; i++)
    {
      if (doubles.get(i) < lowest)
        lowest = doubles.get(i);
    }

    System.out.println("The lowest number you entered was: " + lowest);
  }
}
