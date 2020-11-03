import java.util.Scanner;

/**
 *  Create a program that reads a number of integers from
 *  keyboard and stores them into an array.
 *
 *  Find the second largest value in the
 *  array and print this to the screen.
 */

public class secondLargest
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];
    int high = array[0];
    int secondHigh = array[0];

    for (int i = 0; i < array.length; i++)
    {
      System.out.print("Enter 5 integers: ");
      array[i] = scanner.nextInt();
    }

    for (int i = 0; i < array.length; i++) {

      if (array[i] > high) {
        //Den andenhøjeste værdi (secondhigh) er nu lig den højeste (high)
        //(den high der bliver lagt ind i secondhigh bliver til det gamle højeste tal efter linjen nedenfor)
        secondHigh = high;
        //Den højeste er nu lig med det nye tal
        high = array[i];

      } else if (array[i] > secondHigh) {

        secondHigh = array[i];

      }
    }

    System.out.println("The second highest number you entered was: " + secondHigh);
  }
}
