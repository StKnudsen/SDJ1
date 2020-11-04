import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Create a program that does the following:
 *
 *  Creates two variables named positive and negative,
 *  each of type ArrayList<Integer>
 *
 *  Reads int values from keyboard until you type the value 0. If a value
 *  read from keyboard is positive add it to the ArrayList called
 *  positive and if it is negative add it to negative.
 *
 *  At the end, print out the following
 *  - The amount of positive numbers and amount of negative numbers you added.
 *  - The largest value added.
 *  - The smallest value added.
 */

public class IntegerFun
{
  public static void main(String[] args)
  {
    ArrayList<Integer> positive = new ArrayList<>();
    ArrayList<Integer> negative = new ArrayList<>();

    int largest = 0, smallest = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a positive or negative number (0 to terminate)");

    while (true)
    {
      int input = scanner.nextInt();

      if (input == 0)
        break;

      // First number entered will be set as smallest and largest
      if (positive.size() == 0 && negative.size() == 0)
      {
        largest = input;
        smallest = input;
      }

      if (input > 0)  // Positive
        positive.add(input);

      if (input < 0 ) // Negative
        negative.add(input);

      if (input > largest)
        largest = input;

      if (input < smallest)
        smallest = input;
    }

    System.out.println(positive.size() + " positive numbers and " + negative.size() + " negative.");
    System.out.println("Largest = " + largest + " and smallest = " + smallest);
  }
}
