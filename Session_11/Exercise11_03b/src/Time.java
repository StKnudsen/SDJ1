import java.text.DecimalFormat;

public class Time
{
  private int hour, minute, second;

  public Time(int h, int m, int s)
  {
    hour = h > 23 ? 23 : h;
    minute = m > 59 ? 59 : m;
    second = s > 59 ? 59 : s;
  }

  public Time(int seconds)
  {
    hour = seconds/(60*60) > 23 ? 23 : seconds/(60*60);
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

  public void setTime(int hour, int minute, int second)
  {
    this.hour = hour > 23 ? 23 : hour;
    this.minute = minute > 59 ? 59 : minute;
    this.second = second > 59 ? 59 : second;
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
