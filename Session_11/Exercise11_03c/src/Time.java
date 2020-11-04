import java.text.DecimalFormat;

public class Time
{
  private int hour, minute, second;

  public Time(int h, int m, int s)
  {
    setTime(h, m, s);
  }

  public Time(int seconds)
  {
    hour = seconds/(60*60);
    minute = seconds/60 > 59 ? 23 : seconds/60;
    second = seconds%60;
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

  public void setTime(int h, int m, int s)
  {
    if (h < 0)
      hour = 0;
    else
      hour = h;

    if (m < 0)
      minute = 0;
    else
      minute = m > 59 ? 59 : m;

    if (s < 0)
      second = 0;
    else
      second = s > 59 ? 59 : s;
  }

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
