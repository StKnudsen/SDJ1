public class TestGradeList
{
  public static void main(String[] args)
  {
    Grade grade1 = new Grade("SDJ", 12);
    Grade grade2 = new Grade("RWD", 12);

    grade2.setGrade(10);
    //System.out.println(grade1);
    //System.out.println(grade2);

    GradeList list = new GradeList(5);

    System.out.println(list.getNumberOfGrades());
    list.setGrade(grade1, 0);
    list.setGrade(grade2, 1);

    System.out.println("First grade in array[0]: " + list.getGrade(0));

    System.out.println(list.getAverage());
    System.out.println(list);
  }
}
