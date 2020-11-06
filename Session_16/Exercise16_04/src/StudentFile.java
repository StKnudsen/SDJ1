import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;

public class StudentFile
{
   private File file;

   public StudentFile(String filename)
   {
      setFile(filename);
   }

   public void setFile(String filename)
   {
      file = new File(filename);
   }

   public File getFile()
   {
      return file;
   }

   public StudentList readTextFile() throws FileNotFoundException,
         ParseException
   {
      // TODO: Implement this method
      return null;
   }

   public StudentList readTextFile(String filename)
         throws FileNotFoundException, ParseException
   {
      setFile(filename);



      return readTextFile();
   }

   public void writeTextFile(StudentList students) 
         throws FileNotFoundException
   {
      // TODO: Implement this method
   }

   public void writeTextFile(StudentList students, String filename)
         throws FileNotFoundException
   {
      setFile(filename);
      writeTextFile(students);
   }

   public void writeBinaryFile(StudentList list) throws IOException
   {
      // TODO: Implement this method
   }

   public void writeBinaryFile(StudentList list, String filename)
         throws IOException
   {
      setFile(filename);
      writeBinaryFile(list);
   }

   public StudentList readBinaryFile() throws IOException,
         ClassNotFoundException
   {
      // TODO: Implement this method
      return null;
   }

   public StudentList readBinaryFile(String filename) throws IOException,
         ClassNotFoundException
   {
      setFile(filename);
      return readBinaryFile();
   }

}
