import java.io.*;
import java.util.Scanner;

public class BiReadFile
{
  public static void main(String[] args) throws IOException
  {
    String filename;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter you fiends list filename (friends.bin): ");
    filename = input.nextLine();

    File file = new File("Session_16/Exercise17_02/" + filename);

    FileInputStream fis = new FileInputStream(file);
    ObjectInputStream in = new ObjectInputStream(fis);

    while (fis.available() > 0)
    {
      try
      {
        //System.out.println(in.readUTF());
        System.out.println(in.readObject());
      }
      catch (Exception e)
      {
        //
      }
    }


    in.close();

    System.out.println("End reading data from file: " + file.getAbsolutePath());
  }
}
