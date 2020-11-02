import java.util.Scanner;

/**
 *  Write a program that asks the user to enter three
 *  numbers and print the numbers in sorted order.
 *
 *  This should be done using only if-statements,
 *  no loops or anything at this point
 */

public class SortThreeNumbers
{
  public static void main(String[] args)
  {
    int num1, num2, num3, low = 0, mid = 0, high = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("First number: ");
    num1 = input.nextInt();

    System.out.print("Second number: ");
    num2 = input.nextInt();

    System.out.print("Third number: ");
    num3 = input.nextInt();

    if (num1 > num2)
    {
      if (num1 > num3)
      {
        high = num1;

        if (num2 > num3)
        {
          mid = num2;
          low = num3;
        }
        else
        {
          mid = num3;
          low = num2;
        }
      }
      else
      {
        mid = num1;
        high = num3;
        low = num2;
      }
    }
    else
    {
      if (num2 > num3)
      {
        high = num2;
        if (num1 > num3)
        {
          mid = num1;
          low = num3;
        }
        else
        {
          mid = num3;
          low = num1;
        }
      }
      else
      {
        mid = num2;
        high = num3;
        low = num1;
      }
    }

    System.out.println("The numbers sorted is from low to high " + low + ", " + mid + " and " + high);
  }
}
