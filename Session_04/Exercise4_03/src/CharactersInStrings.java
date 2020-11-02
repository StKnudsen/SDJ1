import java.util.Scanner;

/**
 *  Write a program that asks the user to input a string 6 times, and then
 *  calculates the total number of characters in the 6 strings.
 *
 *  The program should of course use a loop and not just
 *  write the same code 6 times sequentially ;-)
 */

public class CharactersInStrings
{
  public static void main(String[] args)
  {
    final int HOW_MANY_STRINGS = 6;
    int totalCharacters = 0;

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < HOW_MANY_STRINGS; i++)
    {
      System.out.print("Enter string " + (i+1) + " of " + HOW_MANY_STRINGS + ": ");
      totalCharacters += input.nextLine().length();
    }

    System.out.println("The total amount of characters entered is " + totalCharacters);
  }
}
