import java.util.Random;
import java.util.Scanner;

/**
 *  The following piece of code sets target to a random number between 1 and 1000.
 *    java.util.Random random = new java.util.Random();
 *    int target = random.nextInt(1000) + 1;
 *  Use this code to write a program that asks the user to guess the number.
 *  Each time the user guesses wrong tell him if his guess is too
 *  high or too low and ask for the next guess.
 */

public class GuessRandomNumber
{
  public static void main(String[] args)
  {
    Random random = new Random();
    int target = random.nextInt(1000) + 1;

    Scanner scanner = new Scanner(System.in);

    while (true)  // Guess the number stored in target
    {
      System.out.print("Enter your guess: ");
      int guess = scanner.nextInt();
      if (target == guess)
      {
        System.out.println("Yay! you guessed the number " + target + " ... finally");
        break;
      }
      else if (target < guess)
      {
        System.out.println("Your guess is too high ..");
      }
      else if (target > guess)
      {
        System.out.println("Your guess is too low ..");
      }
    }
  }
}