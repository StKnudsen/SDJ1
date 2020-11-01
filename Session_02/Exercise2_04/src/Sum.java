import java.util.Scanner;

/**
 *  Write a program that reads three integers from keyboard and displays
 *  the sum of them all and the product of them all on the screen.
 *  (No loop or arrays)
 */

public class Sum
{
  public static void main(String[] args)
  {
    int sum, product, integer1, integer2, integer3;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first integer: ");
    integer1 = input.nextInt();

    System.out.print("Enter the second integer: ");
    integer2 = input.nextInt();

    System.out.print("Enter the third integer: ");
    integer3 = input.nextInt();

    sum = integer1 + integer2 + integer3;
    product = integer1 * integer2 * integer3;

    System.out.println("Sum of " + integer1 + ", " + integer2 + " and " + integer3 + " is " + sum);
    System.out.println("Product of " + integer1 + ", " + integer2 + " and " + integer3 + " is " + product);
  }
}
