import java.util.Scanner;

/**
 *  Create a program that is the same as the program from Code Listing 2-29,
 *  but in addition it must ask the user for a tax rate and
 *  print net pay after taxes have been deducted.
 */

public class PayrollWithTax
{
  public static void main(String[] args)
  {
    String name;
    int hours;
    double payRate;
    double grossPay;
    double taxRate;   // Tax rate

    Scanner keyboard = new Scanner(System.in);

    System.out.print("What is your name? ");
    name = keyboard.nextLine();

    System.out.print("How many hours did you work this week? ");
    hours = keyboard.nextInt();

    System.out.print("what is your hourly pay rate? ");
    payRate = keyboard.nextDouble();

    System.out.print("What is your tax rate in decimal (0.38 for 38%)? ");
    taxRate = keyboard.nextDouble();

    // Calculate the gross pay.
    grossPay = hours * payRate;

    // Display the resulting information.
    System.out.println("Hello " + name);
    System.out.println("Your gross pay is after tax$" + grossPay * (1 - taxRate));
  }
}
