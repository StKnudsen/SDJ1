import java.io.FileNotFoundException;

public class TestStoreStuff
{
  public static void main(String[] args) throws FileNotFoundException
  {
    String name = "NoName";

    TxtFiles txt = new TxtFiles();

    txt.save(name);
  }
}
