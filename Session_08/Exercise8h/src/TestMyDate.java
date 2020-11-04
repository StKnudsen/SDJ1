public class TestMyDate
{
  public static void main(String[] args)
  {
    int year = -2020;
    int month = 9;
    int day = 23;
    MyDate myDate = new MyDate(day, month, year);

    System.out.println(myDate);
    myDate.stepForwardOneDay();
    System.out.println(myDate);

    MyDate myDateNow = new MyDate();
    System.out.println(myDateNow);

    System.out.println(myDate.equals(myDateNow));
    System.out.println(MyDate.convertToMonthNumber("February"));
  }
}
