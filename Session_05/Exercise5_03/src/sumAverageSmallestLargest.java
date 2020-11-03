import java.util.Scanner;

/**
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
    Scanner scanner = new Scanner(System.in);

    int[] ints = new int[5];

    for (int i = 0; i < ints.length; i++)
    {
      System.out.print("Enter a integer: ");
      ints[i] = scanner.nextInt();
    }

    // SUM & AVERAGE
    int total = 0;
    for (int value : ints)
    {
      total += value;
    }

    System.out.println("The sum of the integers are: " + total);
    System.out.println("The average is: " + total / ints.length);

    // LARGEST VALUE
    int largest = ints[0];
    for (int i = 1; i < ints.length; i++)
    {
      if (ints[i] > largest)
        largest = ints[i];
    }

    System.out.println("The biggest number you entered was: " + largest);

    // SMALLEST VALUE
    int lowest = ints[0];
    for (int i = 1; i < ints.length; i++)
    {
      if (ints[i] < lowest)
        lowest = ints[i];
    }

    System.out.println("The smallest number you entered was: " + lowest);
  }
}
