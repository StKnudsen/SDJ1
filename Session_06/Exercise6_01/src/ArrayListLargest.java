import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Write a program that does the following
 *
 *  Adds some (positive) integers from keyboard into an ArrayList
 *  (it is up to you if you read a fixed number of
 *  integers or use a sentinel value, e.g. -1)
 *  In another loop, finds the index of the largest element
 *  (not the element but where it is located).
 *  After the loop, prints out the index of the largest
 *  element, and the value of this element.
 *  If the list is empty remember to print out a proper message instead.
 */

public class ArrayListLargest
{
  public static void main(String[] args)
  {
    ArrayList<Integer> integers = new ArrayList<>();
    int highest;

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 5; i++)
    {
      System.out.print("Enter " + (i+1) + " of " + 5 + " positive integers: ");
      integers.add(input.nextInt());
    }
    System.out.println("You entered: " + integers);

    highest = integers.get(0);

    for (Integer integer : integers)
    {
      if (integer > highest)
      {
        highest = integer;
      }
    }

    System.out.println("The highest number you entered is placed at index: " + integers.indexOf(highest));
  }
}
