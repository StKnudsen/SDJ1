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
    String value;

    value = switch (this.month)
        {
          case 1 -> "January";
          case 2 -> "February";
          case 3 -> "March";
          case 4 -> "April";
          case 5 -> "May";
          case 6 -> "June";
          case 7 -> "July";
          case 8 -> "August";
          case 9 -> "September";
          case 10 -> "October";
          case 11 -> "November";
          case 12 -> "December";
          default -> "Error";
        };

    return value;
  }
}
