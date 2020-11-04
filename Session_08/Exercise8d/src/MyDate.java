import java.text.DecimalFormat;

public class MyDate
{
  private int day, month, year;
  DecimalFormat deciFormatTwo = new DecimalFormat("00");
  DecimalFormat deciFormatFour = new DecimalFormat("0000");

  public MyDate(int day, int month, int year)
  {
    setAll(day, month, year);
  }

  public void setAll(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
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
        day =1;
      }
      else {
        month++;
        day = 1;
      }
    }
  }
}
