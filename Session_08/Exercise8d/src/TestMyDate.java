public class TestMyDate
{
  public static void main(String[] args)
  {
    int year = 2020;
    int month = 12;
    MyDate myDate = new MyDate(31, month, year);

    System.out.println(myDate);
    myDate.stepForwardOneDay();
    System.out.println(myDate);
  }
}
