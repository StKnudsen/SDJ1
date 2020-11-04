public class TestMyDate
{
  public static void main(String[] args)
  {
    int year = 2020;
    int month = 2;
    MyDate myDate = new MyDate(11, month, year);

    System.out.println(myDate);
    System.out.println(myDate.getMonthName());
    System.out.println(myDate.isLeapYear());

    System.out.println(myDate.numberOfDaysInMonth(month));
  }
}
