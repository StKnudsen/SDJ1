import java.util.Scanner;

/**
 *  Create a program that uses a loop to read 7 decimal numbers
 *  from keyboard and stores them into an array.
 *
 *  Find the smallest element in the array and print this to the screen.
 */

public class SmallestInArray
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    double[] doubles = new double[7];

    for (int i = 0; i < doubles.length; i++)
    {
      System.out.print("Enter 7 decimal numbers: ");
      doubles[i] = scanner.nextDouble();
    }

    double lowest = doubles[0];
    for (int i = 1; i < doubles.length; i++)
    {
      if (doubles[i] < lowest)
        lowest = doubles[i];
    }
    System.out.println("The lowest number you entered was: " + lowest);
  }
}
