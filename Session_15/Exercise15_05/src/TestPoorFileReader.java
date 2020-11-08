import java.io.FileNotFoundException;

public class TestPoorFileReader
{
  public static void main(String[] args) throws FileNotFoundException
  {
    PoorFileReader poorFile = new PoorFileReader();

    try
    {
      poorFile.openFile("poorFileName");
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File doesn't exists, please try another file.");
    }
  }
}
