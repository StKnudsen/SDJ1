import java.io.FileNotFoundException;
import java.text.ParseException;

public class TestStudentFile
{
  public static void main(String[] args)
      throws FileNotFoundException, ParseException
  {
    StudentFile studentFile = new StudentFile("Session_16/Exercise16_04/Students.txt");
    StudentList studentList = studentFile.readTextFile();

    StudentFile writeStudentFile = new StudentFile("Session_16/Exercise16_04/writeStudents.txt");

    studentList.sortByName();
    writeStudentFile.writeTextFile(studentList);

    for (int groupNumber : studentList.getGroupNumbers())
    {
      StudentFile studentGroup = new StudentFile("Session_16/Exercise16_04/StudentGroup" + groupNumber + ".txt");
      studentGroup.writeTextFile(studentList.getByGroup(groupNumber));
    }
  }
}
