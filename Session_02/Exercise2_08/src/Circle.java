import java.util.Scanner;

/**
 *  1) read a double from keyboard and store it in a variable called radius
 *  2) compute the circumference and area of a circle with the given
 *     radius (your keyboard input) and store it in two variables
 *     circumference and area, respectively.
 *  3) print out the result
 */

public class Circle
{
  public static void main(String[] args)
  {
    double radius, circumference, area;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a radius (double): ");
    radius = input.nextDouble();

    circumference = 2 * Math.PI * radius;
    area = Math.PI * Math.pow(radius, 2);

    System.out.println("Radius " + radius + " gives a circle with a circumference "
      + circumference + " and an area " + area);
  }
}
