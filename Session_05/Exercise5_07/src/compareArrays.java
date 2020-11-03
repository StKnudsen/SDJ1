import java.util.Scanner;

/**
 *  Write a program that
 *  - reads 4 integers from keyboard and stores
 *    them into an array (array1)
 *  - reads 4 more integers from keyboard and
 *    stores them into another array (array2)
 *  - uses a loop to check if the two arrays are identical,
 *    i.e. all elements in the two arrays are equal in pairs
 */

public class compareArrays
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int[] array1 = new int[4];
    int[] array2 = new int[4];
    boolean arraysEqual = true;

    for (int i = 0; i < array1.length; i++)
    {
      System.out.print("Tell me 4 integers, and I will put them into an array: ");
      array1[i] = scanner.nextInt();
    }

    for (int i = 0; i < array2.length; i++)
    {
      System.out.print("Tell me 4 integers, and I will put them into another array: ");
      array2[i] = scanner.nextInt();
    }

    for (int i = 0; i < array1.length; i++)
    {
      if (array1[i] != array2[i])
      {
        arraysEqual = false;
        break;  // No reason to check any more iterations
      }
    }

    if (arraysEqual)
    {
      System.out.println("The arrays are equal!");
    }
    else
    {
      System.out.println("The arrays are NOT equal!");
    }
  }
}
