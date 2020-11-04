import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Write a program that does the following:
 *
 *  Asks the user to continously input String elements and store them in an
 *  ArrayList. Only one instance of each unique String must be stored.
 *  If the user inputs a String that is already stored, the program should
 *  inform the user. The String should not be stored in the ArrayList.
 *  After the user finishes inputting String values, the
 *  program should display the items to the user.
 *  The program must then randomize all elements in the ArrayList,
 *  until no element is in the same position as it started.
 *  After the program finishes randomizing, the program
 *  should display the items to the user.
 */

public class StoreRandom
{
  public static void main(String[] args)
  {
    ArrayList<String> items = new ArrayList<String>();
    ArrayList<String> randomized = new ArrayList<>();

    boolean isRandom = false;
    String input;

    Scanner scan = new Scanner(System.in);

    do
    {
      System.out.print("Enter a string for the list: ");
      input = scan.nextLine();

      if (!input.equals(""))
      {
        if (!items.contains(input))
        {
          items.add(input);
        }
      }

    } while (!input.equals(""));

    while (!isRandom)
    {
      // Here is just shifting the items x number of spots..
      // Minus 2, as it must not shift the full length of the array
      int shift = 1 + (int)(Math.random() * ((items.size() - 2) + 1));

      // Fill out the randomized array
      for (int i = 0; i < items.size(); i++)
      {
        int index = i + shift;

        if (index >= items.size())
        {
          index = i + shift - items.size();
        }

        randomized.add(items.get(index));
      }

      isRandom = true;

      // check if the new array does not match item for item the initial array
      for (int i = 0; i < items.size(); i++)
      {
        if (items.get(i).equals(randomized.get(i)))
          isRandom = false;
      }
    }

    // print out the two arrays
    System.out.println("Original: " + items);
    System.out.println("Randomized" + randomized);
  }
}