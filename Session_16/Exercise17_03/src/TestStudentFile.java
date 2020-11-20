import java.io.IOException;
import java.text.ParseException;

public class TestStudentFile
{
  public static void main(String[] args)
      throws IOException, ParseException, ClassNotFoundException
  {
    StudentFile studentFile = new StudentFile("Session_16/Exercise17_03/txt/Students.txt");
    StudentList studentList = studentFile.readTextFile();

    StudentFile studentTxt = new StudentFile("Session_16/Exercise17_03/txt/writeStudents.txt");
    StudentFile studentBin = new StudentFile("Session_16/Exercise17_03/bin/writeStudents.bin");

    studentList.sortByName();

    studentTxt.writeTextFile(studentList);
    studentBin.writeBinaryFile(studentList);

    // Write the groups found in txt file to binary groups
    for (int groupNumber : studentList.getGroupNumbers())
    {
      StudentFile studentGroup = new StudentFile("Session_16/Exercise17_03/bin/StudentGroup" + groupNumber + ".bin");
      studentGroup.writeBinaryFile(studentList.getByGroup(groupNumber));
    }

    // Read BIN file and save as TXT's
    StudentFile studentBinFile = new StudentFile("Session_16/Exercise17_03/bin/writeStudents.bin");
    StudentList studentBinList = studentBinFile.readBinaryFile();

    for (int groupNumber : studentBinList.getGroupNumbers())
    {
      StudentFile studentGroup = new StudentFile("Session_16/Exercise17_03/txt/StudentGroup" + groupNumber + ".txt");
      studentGroup.writeTextFile(studentList.getByGroup(groupNumber));
    }
  }
}
