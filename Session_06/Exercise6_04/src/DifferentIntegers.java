import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Write a program that can do the following:
 *
 *  Read 10 integers from keyboard and store them into an array
 *  Determine how many different elements are stored in the array
 *  I.e. if the array is {1, 3, 5, 3, 5, 1, 2, 10, 7, 8} the
 *  answer is 7, and the values are [1, 3, 5, 2, 10, 7, 8]
 *
 *  A strategy could be the following:
 *
 *  Create a variable of type ArrayList<Integer>
 *  Add elements to the ArrayList if it is not already in the ArrayList
 *  (hint: use the ArrayList method called contains)
 */

public class DifferentIntegers
{
  public static void main(String[] args)
  {
    ArrayList<Integer> elements = new ArrayList<>();
    int[] integers = new int[10];

    Scanner scanner = new Scanner(System.in);

    // Get 10 integers from user
    for (int i = 0; i < integers.length; i++)
    {
      System.out.print("Enter an integer: ");
      integers[i] = scanner.nextInt();
    }

    // If the integer isn't in the elements yet, add it
    for (int integer : integers)
    {
      if (!elements.contains(integer))
        elements.add(integer);
    }

    System.out.println(elements);
  }
}
