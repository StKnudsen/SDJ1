import java.io.*;
import java.util.Scanner;

public class BinFiles implements StoreStuff
{
  @Override public void save(Object obj) throws IOException
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter filename to save to: ");
    String filename = input.nextLine();

    File file = new File("Session_16/Exercise17_04/" + filename + ".bin");

    FileOutputStream fos = new FileOutputStream(file);
    ObjectOutputStream out = new ObjectOutputStream(fos);

    out.writeObject(obj);

    out.close();
  }

  @Override public Object load(String file)
      throws IOException, ClassNotFoundException
  {
    FileInputStream fis = new FileInputStream(file);
    ObjectInputStream in = new ObjectInputStream(fis);

    Object obj = in.readObject();

    in.close();

    return obj;
  }
}
