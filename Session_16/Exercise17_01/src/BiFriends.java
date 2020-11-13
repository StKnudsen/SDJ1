import java.io.*;
import java.util.Scanner;

public class BiFriends
{
  public static void main(String[] args) throws IOException
  {
    String filename = "Session_16/Exercise17_01/friends.bin";
    File file = new File(filename);
    boolean doHaveFriends = true;

    FileOutputStream fos = new FileOutputStream(file);
    ObjectOutputStream out = new ObjectOutputStream(fos);


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
        //out.writeUTF(friendsName);
        out.writeObject(friendsName);
      }
    }

    out.close();

    System.out.println("End writing data to file: " + file.getAbsolutePath());
  }
}
