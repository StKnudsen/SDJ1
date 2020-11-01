import java.util.Scanner;

/**
 *  Write a program that reads your name and age and displays it on the screen.
 */

public class MyNameAndAge
{
  public static void main(String[] args)
  {
    String name;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter name: ");
    name = input.nextLine();

    System.out.print("Enter age: ");
    age = input.nextInt();

    System.out.println("Hi " + age + " years old " + name);
  }
}
