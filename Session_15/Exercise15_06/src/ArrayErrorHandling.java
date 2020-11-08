import java.util.ArrayList;
import java.util.Scanner;

public class ArrayErrorHandling
{
  public static void main(String[] args)
  {
    ArrayList<String> strings = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    strings.add("Bob");
    strings.add("Rob");
    strings.add("Snob");

    String value = "";
    try
    {
      System.out.print("Enter new string: ");
      value = input.nextLine();
      if (value == null)
      {
        throw new IllegalValueException(null);
      }
      if (value == "")
      {
        throw new IllegalValueException("empty string");
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

    /*
    // Search for string: "Mike"
    if (!(strings.contains("Mike")))
    {
      throw new NoMatchingDetailsException("Mike");
    }
    */

    /*
    // Search for empty string: ""
    if (!(strings.contains("")))
    {
      throw new NoMatchingDetailsException("");
    }
    */

    /*
    // Search for string null: null
    if (!(strings.contains(null)))
    {
      throw new NoMatchingDetailsException(null);
    }
    */
  }
}
