import java.util.ArrayList;
import java.util.Scanner;

/**
 *  For Exercise6_05:
 *  Solve the following exercises from last session,
 *  using an ArrayList instead of an array
 *
 *  Create a program that uses a loop to read 10 integers
 *  from keyboard and store them into an array.
 *
 *  Use another loop to print out the elements in reverse order.
 */

public class ArrayInReverseOut
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> integers = new ArrayList<>();

    for (int i = 0; i < 10; i++)
    {
      System.out.print("Enter an integer: ");
      integers.add(scanner.nextInt());
    }

    for(int i = integers.size()-1; i >= 0; i--)
    {
      System.out.println("Index[" + i + "] in the array is set to " + integers.get(i));
    }
  }
}
