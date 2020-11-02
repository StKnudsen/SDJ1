import java.util.Scanner;

/**
 *  Write a program that asks the user for a string representing a name of
 *  a month: "January", “February”, “March”, “April”, “May”,
 *  “June”, “July”, “August”, “September”, “October”,
 *  “November” and “December” are legal values.
 *
 *  Depending on the input the program prints a number representing the
 *  month number: "January"=1, “February”=2, “March”=3, “April”=4,
 *  “May”=5, “June”=6, “July”=7, “August”=8, “September”=9,
 *  “October”=10, “November”=11 and “December”=12.
 *
 *  For any other input print out the value -1.
 *
 *  Use a switch as part of your solution.
 */

public class MonthNumber
{
  public static void main(String[] args)
  {
    String month;
    int monthNumber;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a month: ");
    month = input.nextLine().toUpperCase();

    switch (month)
    {
      case "JANUARY":
        monthNumber = 1;
        break;
      case "FEBRUARY":
        monthNumber = 2;
        break;
      case "MARCH":
        monthNumber = 3;
        break;
      case "APRIL":
        monthNumber = 4;
        break;
      case "MAY":
        monthNumber = 5;
        break;
      case "JUNE":
        monthNumber = 6;
        break;
      case "JULY":
        monthNumber = 7;
        break;
      case "AUGUST":
        monthNumber = 8;
        break;
      case "SEPTEMBER":
        monthNumber = 9;
        break;
      case "OCTOBER":
        monthNumber = 10;
        break;
      case "NOVEMBER":
        monthNumber = 11;
        break;
      case "DECEMBER":
        monthNumber = 12;
        break;
      default:
        monthNumber = -1;
    }

    System.out.println("Translated into month number, it is month " + monthNumber);
  }
}
