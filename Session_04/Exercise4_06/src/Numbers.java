import java.util.Scanner;

/**
 *  Make a program that asks the user for an integer,
 *  n, and prints out the following:
 *  - All the numbers 1, 2, 3, …, n
 *  - All the numbers 2, 4, 6, …, 2·n
 *  - All the numbers 1, 4, 9, …, n2
 */

public class Numbers
{
  public static void main(String[] args)
  {
    int value;
    String numbers = "", timesTwo = "", squared = "";

    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    value = input.nextInt();

    // All the numbers 1, 2, 3, …, n
    for (int i = 1; i <= value; i++)
    {
      numbers += i + (i == value ? "" : ", ");
    }

    // All the numbers 2, 4, 6, …, 2·n
    for (int i = 1; i <= value; i++)
    {
      timesTwo += i*2 + (i == value ? "" : ", ");
    }

    // All the numbers 1, 4, 9, …, n2
    for (int i = 1; i <= value; i++)
    {
      squared += (int) Math.pow(i, 2) + (i == value ? "" : ", ");
    }

    System.out.println(numbers);
    System.out.println(timesTwo);
    System.out.println(squared);
  }
}
