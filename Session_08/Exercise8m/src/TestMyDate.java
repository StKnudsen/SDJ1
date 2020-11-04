public class TestMyDate
{
  public static void main(String[] args)
  {
    int year = 2000;
    int month = 1;
    int day = 1;
    MyDate myDate = new MyDate(day, month, year);

    MyDate myDateNow = new MyDate();

    //System.out.println(myDate);
    //System.out.println(myDateNow);

    // System.out.println(myDate.isBefore(myDateNow));
    System.out.println(myDate.daysBetween(myDateNow));
    //MyDate copiedDate;
    //copiedDate = myDate.copy();

    //System.out.println(copiedDate);
    //System.out.println(myDate);
    //myDate.stepForward(1180);
    //System.out.println(myDate);

    //myDate.stepForwardOneDay();
    //System.out.println(myDate);

    //MyDate myDateNow = new MyDate();
    //System.out.println(myDateNow);

    //System.out.println(myDate.isBefore(myDateNow));
    //System.out.println(myDate.yearsBetween(myDateNow));

    //System.out.println(myDate.equals(myDateNow));
    //System.out.println(MyDate.convertToMonthNumber("February"));
  }
}
