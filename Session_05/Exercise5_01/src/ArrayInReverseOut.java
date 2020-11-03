import java.util.Scanner;

/**
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

    int[] array = new int[10];

    for (int i = 0; i < array.length; i++)
    {
      System.out.print("Enter an integer: ");
      array[i] = scanner.nextInt();
    }

    for(int i = array.length-1; i >= 0; i--)
    {
      System.out.println("Integer " + i + "in the array is set to " + array[i]);
    }
  }
}
