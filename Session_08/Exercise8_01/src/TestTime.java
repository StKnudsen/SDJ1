public class TestTime
{
  public static void main(String[] args)
  {
    Time time = new Time(13,45,30);
    Time timeSec = new Time(605);

    System.out.println(time);
    System.out.println(timeSec);
    System.out.println(timeSec.getTimeInSeconds());

    System.out.println(timeSec.getHour());
    System.out.println(timeSec.getMinute());
    System.out.println(timeSec.getSecond());


  }
}
