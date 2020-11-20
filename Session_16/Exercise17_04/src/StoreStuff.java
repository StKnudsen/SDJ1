import java.io.IOException;

public interface StoreStuff
{
  void save(Object obj) throws IOException;
  Object load(String file) throws IOException, ClassNotFoundException;
}
