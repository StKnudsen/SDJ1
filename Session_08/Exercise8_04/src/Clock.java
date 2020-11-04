import java.text.DecimalFormat;

public class Clock
{
  private int hour, minute, second;
  private boolean is24HourFormat;

  public Clock(int hour, int minute, int second)
  {
    this.set(hour, minute, second);
  }

  public Clock(int seconds)
  {
    hour = seconds/(60*60) > 23 ? 23 : seconds/(60*60);
    minute = seconds/60 > 59 ? 23 : seconds/60;
    second = seconds%60;
    is24HourFormat = true;
  }

  public void set(int hour, int minute, int second)
  {
    this.hour = hour > 23 ? 23 : hour;
    this.minute = minute > 59 ? 59 : minute;
    this.second = second > 59 ? 59 : second;
    this.is24HourFormat = true;
  }

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

  public boolean get24HourFormat()
  {
    return is24HourFormat;
  }

  public void set24HourFormat ()
  {
    is24HourFormat = true;
  }

  public void set12HourFormat()
  {
    is24HourFormat = false;
  }

  // Add one second to time
  public void tic()
  {
    second++;

    if (second >= 60) // 60 seconds or above adds a minute and reset seconds
    {
      minute++;
      second = 0;

      if (minute >= 60) // 60 minutes or above adds an hour and reset minutes
      {
        hour++;
        minute = 0;

        if (hour >= 24)// 24 hours or above, reset hours (a new day)
        {
          hour = 0;
        }
      }
    }
  }

  public int convertToSeconds()
  {
    return hour*60*60 + minute*60 + second;
  }

  public boolean isBefore(Clock time)
  {
    if (hour < time.hour)
      return true;
    else if (hour == time.hour && minute < time.minute)
      return true;
    else if (hour == time.hour && minute == time.minute && second < time.second)
      return true;
    return false;
  }

  public Clock copy()
  {
    return new Clock(hour, minute, second);
  }

  public boolean equals(Clock time)
  {
    if (!(time instanceof Clock))
      return false;

    Clock compare = (Clock) time;

    return hour == compare.hour && minute == compare.minute && second == compare.second;
  }

  public String toString()
  {
    DecimalFormat decimal = new DecimalFormat("00");
    String amPm;
    int amPmHour;

    if (is24HourFormat)
      return decimal.format(hour) + ":" + decimal.format(minute) + ":" + decimal.format(second);

    if (hour < 12)
    {
      amPm = "AM";
      amPmHour = hour;

      if (hour == 0)
      {
        amPmHour = 12;
      }
    }
    else
    {
      amPm = "PM";
      amPmHour = hour - 12;

      if (amPmHour == 0)
      {
        amPmHour = 12;
      }
    }

    return decimal.format(amPmHour) + ":" + decimal.format(minute) + ":" + decimal.format(second) + " " + amPm;
  }
}
