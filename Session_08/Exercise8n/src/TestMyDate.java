public class TestMyDate
{
  public static void main(String[] args)
  {
    // That the set method converts invalid input as it should
    MyDate convertDate = new MyDate(400, -4, -2000);
    System.out.println(convertDate);

    // That numberOfDaysInMonth returns the correct answer for leap years.
    MyDate februaryInLeapYear = new MyDate(28,4,2020);
    System.out.println(februaryInLeapYear.numberOfDaysInMonth(2));

    // That yearBetween returns the correct answer, when one of the years is a leap year with date: 28/02/xxxx
    System.out.println(februaryInLeapYear.yearsBetween(convertDate));

    // That copy returns a MyDate object with the same values.
    MyDate dateCopied = convertDate.copy();
    // Add one day to the copy, this should not affect the convertDate
    dateCopied.stepForwardOneDay();
    System.out.println(dateCopied + " - " + convertDate);

    // That equals always returns true if used on a MyDate object and the copy of that MyDate object.
    MyDate dateEquals = convertDate.copy();
    System.out.println(dateEquals.equals(convertDate));

    // That using a MyDate object as argument for System.out.println calls the toString method.
    System.out.println(convertDate + " - " +convertDate.toString());

    // That convertToMonthNumber and now can be used in a static context (i.e. NOT calling it on a MyDate object)
    System.out.println(MyDate.convertToMonthNumber("February"));
    System.out.println(MyDate.now());

    MyDate date1 = new MyDate(29, 10, 2001);
    MyDate date2 = new MyDate(6, 12, 2006);

    System.out.println(date1.yearsBetween(date2));

    date1.stepForwardOneDay();
    System.out.println(date1);
  }
}
