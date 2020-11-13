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
    System.out.println("End writing students to file: " + fileSave.getAbsolutePath());
  }

  @Override public Object load(String file)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter filename to load: ");
    String filename = input.nextLine();

    return new File("Session_16/Exercise17_04/" + filename + ".txt");
  }
}
