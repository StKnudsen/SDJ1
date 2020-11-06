import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
  public static void main(String[] args) throws FileNotFoundException
  {
    String filename;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter you fiends list filename (friends.txt): ");
    filename = input.nextLine();

    File file = new File(filename);

    Scanner in = new Scanner(file);

    while (in.hasNext())
    {
      String line = in.nextLine();
      System.out.println(line);
    }

    in.close();

    System.out.println("End reading data from file: " + file.getAbsolutePath());
  }
}
