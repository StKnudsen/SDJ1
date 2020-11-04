public class TestMyDate
{
  public static void main(String[] args)
  {
    int year = -2020;
    int month = 0;
    int day = 0;
    MyDate myDate = new MyDate(day, month, year);

    System.out.println(myDate);
    myDate.stepForwardOneDay();
    System.out.println(myDate);
  }
}
