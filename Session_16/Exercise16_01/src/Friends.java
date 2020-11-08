import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Friends
{
  public static void main(String[] args) throws FileNotFoundException
  {
    String filename = "friends.txt";
    boolean doHaveFriends = true;

    File file = new File("Session_16/Exercise16_01/Friends.txt");

    PrintWriter out = new PrintWriter(file);

    Scanner input = new Scanner(System.in);

    while (doHaveFriends)
    {
      String friendsName;

      System.out.print("Type in friends name (or QUIT, to exit): ");
      friendsName = input.nextLine();

      if (friendsName.equals("QUIT"))
      {
        doHaveFriends = false;
      }
      else
      {
        out.println(friendsName);
      }
    }

    out.close();

    System.out.println("End writing data to file: " + file.getAbsolutePath());
  }
}
