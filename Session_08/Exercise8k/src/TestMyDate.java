public class TestMyDate
{
  public static void main(String[] args)
  {
    int year = 2022;
    int month = 8;
    int day = 25;
    MyDate myDate = new MyDate(day, month, year);

    System.out.println(myDate);
    //myDate.stepForward(1180);
    //System.out.println(myDate);

    //myDate.stepForwardOneDay();
    //System.out.println(myDate);

    MyDate myDateNow = new MyDate();
    System.out.println(myDateNow);

    //System.out.println(myDate.isBefore(myDateNow));
    System.out.println(myDate.yearsBetween(myDateNow));

    //System.out.println(myDate.equals(myDateNow));
    //System.out.println(MyDate.convertToMonthNumber("February"));
  }
}
