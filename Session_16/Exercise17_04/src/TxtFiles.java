import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TxtFiles implements StoreStuff
{
  @Override public void save(Object obj) throws FileNotFoundException
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter filename to save to: ");
    String filename = input.nextLine();

    File fileSave = new File("Session_16/Exercise17_04/" + filename + ".txt");

    PrintWriter out = new PrintWriter(fileSave);

    out.println(obj.toString());

    out.close();
  }

  @Override public Object load(String file) throws FileNotFoundException
  {
    File filename = new File(file);
    Scanner in = new Scanner(filename);

    String line = in.nextLine();

    in.close();

    return line;
  }
}
