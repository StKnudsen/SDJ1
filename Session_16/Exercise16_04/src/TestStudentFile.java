import java.io.FileNotFoundException;
import java.text.ParseException;

public class TestStudentFile
{
  public static void main(String[] args)
      throws FileNotFoundException, ParseException
  {
    // What file are we reading from:
    StudentFile studentFile = new StudentFile("Session_16/Exercise16_04/txt/Students.txt");

    // Read the content of that file:
    StudentList studentList = studentFile.readTextFile();

    // Angiv hvilken fil der skal skrives til
    StudentFile writeStudentFile = new StudentFile("Session_16/Exercise16_04/txt/writeStudents.txt");

    // Sortere efter navn
    studentList.sortByName();

    // Skriv indholdet fra studenList til writeStudentFile
    writeStudentFile.writeTextFile(studentList);


    for (int groupNumber : studentList.getGroupNumbers())
    {
      StudentFile studentGroup = new StudentFile("Session_16/Exercise16_04/txt/StudentGroup" + groupNumber + ".txt");
      studentGroup.writeTextFile(studentList.getByGroup(groupNumber));
    }
  }
}
