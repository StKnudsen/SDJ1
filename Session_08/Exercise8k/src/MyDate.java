import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate
{
  private int day, month, year;
  DecimalFormat deciFormatTwo = new DecimalFormat("00");
  DecimalFormat deciFormatFour = new DecimalFormat("0000");

  public MyDate(int day, int month, int year)
  {
    setAll(day, month, year);
  }

  public MyDate ()
  {
    Calendar now = GregorianCalendar.getInstance();

    this.year = now.get(Calendar.YEAR);
    this.month = now.get(Calendar.MONTH) + 1;
    this.day = now.get(Calendar.DAY_OF_MONTH);
  }

  public void setAll(int day, int month, int year)
  {
    // If year is negative, make it positive
    if (year < 0 )
      this.year = year * -1;
    else
      this.year = year;

    // If month is negative, use january, if above 12, use december
    if (month < 1)
      this.month = 1;
    else if (month > 12)
      this.month = 12;
    else
      this.month = month;

    // If a day is less than 1 is should be set to 1
    // If the day is larger than the last day in the given month,
    // then it should be set to the last day in the month
    if (day < 1)
      this.day = 1;
    else if (day > numberOfDaysInMonth(this.month))
      this.day = numberOfDaysInMonth(this.month);
    else
      this.day = day;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public String toString()
  {
    return deciFormatTwo.format(day) + "/" + deciFormatTwo.format(month) + "/" + deciFormatFour.format(year);
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1: return "January";
      case 2: return "February";
      case 3: return "March";
      case 4: return "April";
      case 5: return "May";
      case 6: return "June";
      case 7: return "July";
      case 8: return "August";
      case 9: return "September";
      case 10: return "October";
      case 11: return "November";
      case 12: return "December";
      default: return "Error";
    }
  }

  public boolean isLeapYear()
  {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
      return true;
    else
      return false;
  }

  public int numberOfDaysInMonth(int monthNumber)
  {
    if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12)
      return 31;
    else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11)
      return 30;
    else if (monthNumber == 2)
    {
      return isLeapYear() ? 29 : 28;
    }
    return -1;
  }

  public void stepForwardOneDay()
  {
    if (day + 1 < numberOfDaysInMonth(month))
      ++day;
    else
    {
      if (month + 1 > 12)
      {
        year++;
        month = 1;
      }
      else {
        month++;
      }
      day = 1;
    }
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof MyDate))
      return false;

    MyDate compare = (MyDate) obj;

    return day == compare.day && month == compare.month && year == compare.year;
  }

  public static int convertToMonthNumber(String monthName)
  {
    switch (monthName)
    {
      default: return -1;
      case "January": return 1;
      case "February": return 2;
      case "March": return 3;
      case "April": return 4;
      case "May": return 5;
      case "June": return 6;
      case "July": return 7;
      case "August": return 8;
      case "September": return 9;
      case "October": return 10;
      case "November": return 11;
      case "December": return 12;
    }
  }

  public void stepForward(int days)
  {
    for (int i = 0; i < days; i++)
      stepForwardOneDay();
  }

  public boolean isBefore(MyDate other)
  {
    if (year <= other.year && month <= other.month && day < other.day)
      return true;

    return false;
  }

  public int yearsBetween(MyDate other)
  {
    int difference = year - other.year;

    if (difference < 0)
    {
      // If other year is greater than year.. look at months and days
      if (month < other.month)
      {
        return difference * -1;
      }
      else if (month == other.month)
      {
        if (day <= other.day)
          return difference * -1;
        return (difference * -1) - 1;
      }
      else
      {
        return (difference * -1) -1;
      }

    }
    else if (difference > 0) {
      // If year is greater than other year.. look at months and days
      if (month > other.month )
      {
        return difference;
      }
      else if (month == other.month)
      {
        if (day >= other.day) // if days are equal, count is as x year(s) ago
          return difference;
      }
      else return difference -1;
    }
    return 0;
  }
}
