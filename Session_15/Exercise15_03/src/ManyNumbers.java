import java.util.Scanner;

public class ManyNumbers
{
  public static void main(String[] args)
  {
    // first ask the user how many numbers he wants to input
    double[] numbers;
    int[] indexOfNumbers = new int[2];
    int amount = 0, index;
    boolean gotOperation = false;
    boolean gotIndex;

    String operation = "";
    String howManyNumbers = "How many numbers will you type? ";

    Scanner input = new Scanner(System.in);

    while (amount == 0)
    {
      try
      {
        System.out.print(howManyNumbers);
        amount = input.nextInt();
        if (amount < 1)
        {
          amount = 0;
          howManyNumbers = "HOW MANY NUMBERS WILL YOU TYPE? ";
        }
        //else {
        //  input.nextLine();
        //}
      }
      catch (Exception e)
      {
        howManyNumbers = "HOW MANY NUMBERS WILL YOU TYPE? ";
        input.next();
      }
    }

    numbers = new double[amount];

    // Continuously prompt the user to input a new number until
    // he has input as many as he specified
    for (index = 0; index < amount;)
    {
      double number;

      try
      {
        System.out.print("Type in " + (index + 1) + " of " + amount + ": ");
        number = input.nextDouble();
        input.nextLine();
        numbers[index] = number;
        index++;
      }
      catch (Exception e)
      {
        input.next();
      }
    }

    // Display the numbers to the user.
    String printOut = "Numbers entered: \n";

    for (int i = 0; i < amount; i++)
    {
      printOut += "index " + i + ": " + numbers[i] + "\n";
    }

    System.out.println(printOut);


    // two numbers from the list of numbers, and ask the user what
    // mathematical operation he wants to perform on the two
    // selected numbers (add, subtract, divide, multiply).
    System.out.println("Please select two numbers by their index numbers");

    for (int i = 0; i < indexOfNumbers.length; i++)
    {
      gotIndex = false;
      int value;

      while (!gotIndex)
      {
        try
        {
          System.out.print("Get index of " + (i == 0 ? "first" : "second") + " number: ");
          value = input.nextInt();
          input.nextLine();

          //System.out.println(i + " " + value);

          if (value >= 0 && value < amount)
          {
            indexOfNumbers[i] = value;
            gotIndex = true;
          }
        }
        catch (Exception e)
        {
          input.next();
        }
      }
    }


    while (!gotOperation)
    {
      String value;

      try
      {
        System.out.print("Which operation (add, subtract, divide, multiply) should be performed? ");
        value = input.nextLine();

        if (value.equals("add") || value.equals("subtract") || value.equals("divide") || value.equals("multiply"))
        {
          operation = value;
          gotOperation = true;
        }
      }
      catch (Exception e)
      {
        //
      }
    }

    // Perform the selected operation on the two selected
    // numbers and display the result to the user.

    if (operation.equals("add"))
    {
      System.out.println(numbers[indexOfNumbers[0]] + " + " + numbers[indexOfNumbers[1]]
          + " = " + (numbers[indexOfNumbers[0]] + numbers[indexOfNumbers[1]]));
    }

    if (operation.equals("subtract"))
    {
      System.out.println(numbers[indexOfNumbers[0]] + " - " + numbers[indexOfNumbers[1]]
          + " = " + (numbers[indexOfNumbers[0]] - numbers[indexOfNumbers[1]]));
    }

    if (operation.equals("divide"))
    {
      System.out.println(numbers[indexOfNumbers[0]] + " / " + numbers[indexOfNumbers[1]]
          + " = " + (numbers[indexOfNumbers[0]] / numbers[indexOfNumbers[1]]));
    }

    if (operation.equals("multiply"))
    {
      System.out.println(numbers[indexOfNumbers[0]] + " * " + numbers[indexOfNumbers[1]]
          + " = " + (numbers[indexOfNumbers[0]] * numbers[indexOfNumbers[1]]));
    }
  }
}
