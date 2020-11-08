import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoorFileReader
{
   public void openFile(String filename) throws FileNotFoundException
   {
      File file = new File("Session_15/Exercise15_05/" + filename + ".txt");
      Scanner scanner = new Scanner(file);
      scanner.close();
   }
}