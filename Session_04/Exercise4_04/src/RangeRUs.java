import java.util.Scanner;

/**
 *  Write an program, that asks the user to input a
 *  number between 10 and 25 (both inclusive).
 *
 * The program should continue to ask for input, as long as
 * the user inputs anything that is outside the range.
 *
 * Once the user inputs something inside the range, the
 * program should display the number and terminate.
 */

public class RangeRUs
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    final int LOWER_LIMIT = 10, UPPER_LIMIT = 25;
    int number;

    do {
      System.out.print("Enter a number between " + LOWER_LIMIT + " and " + UPPER_LIMIT + ": ");
      number = scanner.nextInt();
    } while (number < LOWER_LIMIT || number > UPPER_LIMIT);

    System.out.println("You entered: " + number);
  }
}