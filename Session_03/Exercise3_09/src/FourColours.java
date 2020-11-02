import java.util.Scanner;

/**
 *  For this exercise, write a program that asks a user to choose
 *  between four colours: black, white, red, or blue. The
 *  user should input the answer as a String.
 *
 *  Use a switch to display one of the following messages,
 *  depending on which colour was chosen:
 *  - BLACK "You must be a Goth!"
 *  - WHITE "You are a very pure person"
 *  - RED "You are fun and outgoing"
 *  - BLUE "You're not a Chelsea fan, are you?"
 */

public class FourColours
{
  public static void main(String[] args)
  {
    String colour, output;

    Scanner input = new Scanner(System.in);

    System.out.print("Please enter one of the following colours (BLACK, WHITE, RED, BLUE): ");
    colour = input.nextLine().toUpperCase();

    switch (colour)
    {
      case "BLACK":
        output = "You must be a Goth!";
        break;
      case "WHITE":
        output = "You are a very pure person";
        break;
      case "RED":
        output = "You are fun and outgoing";
        break;
      case "BLUE":
        output = "You're not a Chelsea fan, are you?";
        break;
      default:
        output = "Can't interpret that colour!";
    }

    System.out.println(output);
  }
}
