import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Solve exercise 5.07 from the last session,
 *  using an ArrayList instead of an array
 *
 *  Your solution can be made easier,
 *  using the .equals() method
 */

public class compareArrays
{
  public static void main(String[] args)
  {
    ArrayList<Integer> integers1 = new ArrayList<>();
    ArrayList<Integer> integers2 = new ArrayList<>();
    final int NUMBER_OF_INTEGERS = 4;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < NUMBER_OF_INTEGERS; i++)
    {
      System.out.print("Tell me " + NUMBER_OF_INTEGERS +
          " integers, and I will put them into an array: ");
      integers1.add(scanner.nextInt());
    }

    for (int i = 0; i < NUMBER_OF_INTEGERS; i++)
    {
      System.out.print("Tell me " + NUMBER_OF_INTEGERS +
          " integers, and I will put them into another array: ");
      integers2.add(scanner.nextInt());
    }

    if (integers1.equals(integers2))
    {
      System.out.println("The arrays are equal!");
    }
    else
    {
      System.out.println("The arrays are NOT equal!");
    }
  }
}
