import java.util.Scanner;

/**
 *  Write a program that reads two integers from the keyboard,
 *  multiplies them, displays the result on the screen, then
 *  reads a third number from keyboard and adds that number
 *  to the result, then displays the result.
 */
public class MultiplyAdd
{
  public static void main(String[] args)
  {
    int sum, integer1, integer2, integer3;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first integer: ");
    integer1 = input.nextInt();

    System.out.print("Enter the integer to multiply with: ");
    integer2 = input.nextInt();

    sum = integer1 * integer2;

    System.out.println("So far we have " + integer1 + " times " + integer2 + " equals " + sum);

    System.out.print("Enter a third integer to add to sum: ");
    integer3 = input.nextInt();

    System.out.println(sum + " plus " + integer3 + " is " + (sum + integer3));
  }
}
