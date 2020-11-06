import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
  public static void main(String[] args) throws FileNotFoundException
  {
    // read students from file, add them to StudentList as Student objects
    StudentList students = new StudentList();

    File file = new File("students.txt");

    Scanner in = new Scanner(file);

    while (in.hasNext())
    {
      String line = in.nextLine();

      String[] token = line.split(",");

      int groupNumber = Integer.parseInt(token[0].trim());
      int studentNumber = Integer.parseInt(token[1].trim());
      String name = token[2].trim();
      String nationality = token[3].trim();
      int birthdayDay = Integer.parseInt(token[4].trim());
      int birthdayMonth = Integer.parseInt(token[5].trim());
      int birthdayYear = Integer.parseInt(token[6].trim());

      students.add(new Student(name, studentNumber, nationality, groupNumber,
          (new MyDate(birthdayDay, birthdayMonth, birthdayYear))));
    }

    in.close();

    System.out.println(students);
    System.out.println("End reading data from file: " + file.getAbsolutePath());
  }
}
