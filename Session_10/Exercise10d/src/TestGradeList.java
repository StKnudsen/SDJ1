public class TestGradeList
{
  public static void main(String[] args)
  {
    Grade grade1 = new Grade("SDJ", 12);
    Grade grade2 = new Grade("RWD", 12);

    grade2.setGrade(10);
    //System.out.println(grade1);
    //System.out.println(grade2);

    GradeList list = new GradeList();

    System.out.println(list.getNumberOfGrades());
    list.addGrade(grade1);
    list.addGrade(grade2);

    System.out.println("getAllGrades should return an array: " + list.getAllGrades());

    System.out.println(list.getAverage());
    System.out.println(list);
  }
}
