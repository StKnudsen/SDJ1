import java.util.Scanner;

/**
 *  write a program that reads 5 integers from keyboard,
 *  calculates and prints the average.
 */

public class PrintAverage
{
  public static void main(String[] args)
  {
    double sum = 0;
    final int HOW_MANY_INTEGERS = 5;

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < HOW_MANY_INTEGERS; i++)
    {
      System.out.print("Enter an integer " + (i + 1) + ": ");
      sum += input.nextDouble();
    }

    System.out.println("The average of the numbers is: " + (sum/HOW_MANY_INTEGERS));
  }
}
