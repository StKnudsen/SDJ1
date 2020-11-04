import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Write a program that does the following:
 *
 *  Reads some Strings from keyboard and stores them into an ArrayList
 *
 *  Allows the user to keep on inserting elements until he types
 *  the empty string, i.e. just presses the ENTER key
 *  (You should not store this element in the ArrayList).
 *
 *  Creates a String array with the same size as the ArrayList and
 *  copy all elements from the ArrayList into the array.
 *
 *  Makes a new loop and prints out all elements from the array.
 */

public class ArrayListToArray
{
  public static void main(String[] args)
  {
    ArrayList<String> strings = new ArrayList<>();
    String input;

    Scanner scanner = new Scanner(System.in);

    while(true)
    {
      System.out.print("Enter some strings, end by pressing enter: ");
      input = scanner.nextLine();

      if (input.equals("")) // The 'enter' to end the loop
      {
        System.out.println("Give me a second...");
        break;
      }

      strings.add(input);
    }
    System.out.println("I will copy your inputs to an Array!");

    String[] copy = new String[strings.size()];

    for (int index = 0; index < strings.size(); index++)
      copy[index] = strings.get(index);
    System.out.println("The contents of my copy is: ");

    for (String content : copy)
      System.out.print(content + " ");
    System.out.println();
  }
}
