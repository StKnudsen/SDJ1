import java.text.DecimalFormat;

public class Time
{
  /**
   *  Three instance variables, hour, minute and second – all of type int.
   */
  private int hour, minute, second;

  /**
   *  A 3-argument constructor taking hour, minute and seconds.
   *  Remember to change values to represent a legal
   *  time if not already legal.
   *  A legal time is one where seconds and minutes
   *  is < 60 and >= 0, and hour is >= 0.
   *  In the cases where input is not legal, make the changes so
   *  that the input is set to the closest legal input.
   *  For instance, if input for minutes is 75, it should
   *  be set to 59. If it is -50, it should be set to 0.
   * */
  public Time(int h, int m, int s)
  {
    hour = h > 23 ? 23 : h;
    minute = m > 59 ? 59 : m;
    second = s > 59 ? 59 : s;
  }

  /**
   *  A one-argument constructor taking an int as
   *  argument (representing the time in seconds).
   * This number should be converted to the appropriate
   * amount of hours, minutes and seconds.
   * Example: if the argument is 605, then the instance variables
   * are set to: hour=0, minute=10, and second=5
   */
  public Time(int seconds)
  {
    hour = seconds/(60*60) > 23 ? 23 : seconds/(60*60);
    minute = seconds/60 > 59 ? 23 : seconds/60;
    second = seconds%60;
  }

  /**
   *  Get methods for all 3 instance variables.
   */
  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  /**
   *  A set method that sets the three instance variables
   *  to the values given as arguments.
   */
  public void setTime(int hour, int minute, int second)
  {
    this.hour = hour > 23 ? 23 : hour;
    this.minute = minute > 59 ? 59 : minute;
    this.second = second > 59 ? 59 : second;
  }

  /**
   *  A method getTimeInSeconds that converts back
   *  to an int representing total seconds.
   *  Example: If instance variables are hour=0, minute=10,
   *  and second=5 then the method returns the integer 605
   */
  public int getTimeInSeconds()
  {
    return hour * 60 * 60 + minute * 60 + second;
  }

  public String toString()
  {
    DecimalFormat twoDigits = new DecimalFormat("00");
    return twoDigits.format(hour) + ":" + twoDigits.format(minute) + ":" + twoDigits.format(second);
  }
}
