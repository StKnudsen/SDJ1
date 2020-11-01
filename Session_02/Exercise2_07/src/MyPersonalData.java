import java.util.Scanner;

/**
 *  Write a program that reads your name and age and
 *  address and displays it on the screen.
 */

public class MyPersonalData
{
  public static void main(String[] args)
  {
    String name, address;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter name: ");
    name = input.nextLine();

    System.out.print("Enter age: ");
    age = input.nextInt();

    input.nextLine(); // Read the 'carriage return', so address can be accepted

    System.out.print("Enter address: ");
    address = input.nextLine();

    System.out.println(name + ", " + age + " year old, lives at " + address);
  }
}
