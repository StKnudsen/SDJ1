import java.util.Scanner;

/**
 *  The program must read input from the user.
 *  The user must input their age.
 *  The program must then display a message according to the input.
 *  - If the age is less than 0 display the message: “Error in age value”
 *  - If the age is between 0 and 12 (12 included) display the message: “You are a child”
 *  - If the age is between 12 and 19 (19 included) display the message: “You are a teenager”
 *  - If the age is between 19 and 65 (65 included) display the message: “You are an adult”
 *  - If the age is larger than 65 display the message: “You are a senior citizen”
 */

public class AgeBracket
{
  public static void main(String[] args)
  {
    String output = "";
    int age;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your age: ");
    age = input.nextInt();

    if (age < 0)
    {
      output = "Error in age value";
    }
    else if (age >= 0 && age <= 12)
    {
      output = "You are a child";
    }
    else if (age > 12 && age <= 19)
    {
      output = "You are a teenager";
    }
    else if (age > 19 && age <= 65)
    {
      output = "You are an adult";
    }
    else if (age > 65)
    {
      output = "You are a senior citizen";
    }

    System.out.println(output);
  }
}
