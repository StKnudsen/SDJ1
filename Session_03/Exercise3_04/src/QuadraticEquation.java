import java.util.Scanner;

/**
 *  A quadratic equation is of the form "ax2 + bx + c = 0"
 *
 *  Given the above equation the determinant is defined by D = b2-4ac.
 *
 *  The solution to the equation can be found as follows:
 *  - If D < 0, the equation has no solutions.
 *  - If D = 0, the equation has one solution: x = -b / 2a.
 *  - If D > 0, the equation has two solutions:
 *    x = (-b + sqrt(D)/2a and x = (-b - sqrt(D)/2a .
 *
 *  Write a program (ie. create a new module and class file, name them whatever
 *  you want) that asks the user for the values of a, b, and c, and
 *  prints out all solutions to the quadratic equations.
 */
public class QuadraticEquation
{
  public static void main(String[] args)
  {
    double a, b, c, d;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the quadratic equation's a value: ");
    a = input.nextDouble();

    System.out.print("Enter the quadratic equation's b value: ");
    b = input.nextDouble();

    System.out.print("Enter the quadratic equation's c value: ");
    c = input.nextDouble();

    d = Math.pow(b, 2) - 4 * a * c;

    if (d < 0)
    {
      System.out.println("The equation has no solutions.");
    }
    if (d == 0)
    {
      System.out.println("The equation has one solution: " + (-b / (2*a)));
    }
    if (d > 0)
    {
      System.out.println("The equation has two solutions: "
        + ((-b + Math.sqrt(d)) / (2*a)) + " and "
        + ((-b - Math.sqrt(d)) / (2*a)));
    }
  }
}
