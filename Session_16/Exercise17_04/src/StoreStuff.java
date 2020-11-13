import java.io.FileNotFoundException;

public interface StoreStuff
{
  void save(Object obj) throws FileNotFoundException;
  Object load(String file);
}
