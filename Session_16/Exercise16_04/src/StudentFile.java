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
      try
      {
         StudentList studentList = new StudentList();
         File file = getFile();
         Scanner in = new Scanner(file);

         while (in.hasNext())
         {
            String line = in.nextLine();

            String[] token = line.split(",");

            if (token.length != 7)
            {
               throw new ParseException(line, token.length);
            }
            else
            {
               int groupNumber = Integer.parseInt(token[0].trim());
               int studentNumber = Integer.parseInt(token[1].trim());
               String name = token[2].trim();
               String nationality = token[3].trim();
               int birthdayDay = Integer.parseInt(token[4].trim());
               int birthdayMonth = Integer.parseInt(token[5].trim());
               int birthdayYear = Integer.parseInt(token[6].trim());

               studentList.add(new Student(name, studentNumber, nationality, groupNumber,
                   (new MyDate(birthdayDay, birthdayMonth, birthdayYear))));
            }
         }
         in.close();

         return studentList;
      }
      finally
      {
         //
      }
      //return null;
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
      File file = getFile();
      PrintWriter out = new PrintWriter(file);

      for (int i = 0; i < students.size(); i++)
      {
         out.println(
            students.get(i).getGroupNumber() + ", " +
            students.get(i).getStudyNumber() + ", " +
            students.get(i).getName() + ", " +
            students.get(i).getNationality() + ", " +
            students.get(i).getBirthday().getDay() + ", " +
            students.get(i).getBirthday().getMonth() + ", " +
            students.get(i).getBirthday().getYear()
         );
      }

      out.close();
      System.out.println("End writing students to file: " + file.getAbsolutePath());
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
