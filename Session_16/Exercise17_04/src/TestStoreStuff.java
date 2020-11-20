import java.io.IOException;

public class TestStoreStuff
{
  public static void main(String[] args)
      throws IOException, ClassNotFoundException
  {
    String name = "NoName Hippo";

    TxtFiles txt = new TxtFiles();
    BinFiles bin = new BinFiles();

    txt.save(name);
    bin.save(name);

    System.out.println(txt.load("Session_16/Exercise17_04/name.txt"));
    System.out.println(bin.load("Session_16/Exercise17_04/name.bin"));
  }
}
