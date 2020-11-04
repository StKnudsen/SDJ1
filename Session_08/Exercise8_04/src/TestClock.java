public class TestClock
{
  public static void main(String[] args)
  {
    /*
     *  Create a Clock object and in a loop call tic() and print out the
     *  time (using toString) to inspect all times from 00:00:00 to
     *  and an extra call to tic() to go to 00:00:00 again
     */
    Clock clock = new Clock(0,0,0);
    int madness = 24*60*60 + 1; // max hours * minutes * seconds + 1

    for (int i = 0; i < madness; i++)
    {
      System.out.println(clock);
      clock.tic();
    }

    /*
     *  Further, test method equals, the getters,
     *  set, convertToSeconds and isBefore
     */
    clock = new Clock(12,23,34);
    Clock clockTest = new Clock(12,23,34);

    System.out.println("Equals test: " + clock.equals(clockTest));

    System.out.println("Getters test: "
        + clock.getHour() + " hours, "
        + clock.getMinute() + " minutes and "
        + clock.getSecond() + " seconds.");

    clockTest.set(0,4,8);
    System.out.println("Set test: " + clockTest);

    System.out.println("That is in seconds: " + clockTest.convertToSeconds());

    System.out.println("clock = " + clock + " & clockTest = " + clockTest);
    System.out.println("Is 'clock' before 'clockTest': " + clock.isBefore(clockTest));
    System.out.println("Is 'clockTime' before 'clock': " + clockTest.isBefore(clock));

    /*
     *  Reuse the test class to include testing for a 12 hour time format.
     */
    clock.set12HourFormat();
    System.out.println("'clock' in 12 hour format: " + clock);

    clockTest.set12HourFormat();
    System.out.println("'clockTest' in 12 hour format: " + clockTest);

    clock.set24HourFormat();
    System.out.println("'clock' back to 24 hour format: " + clock);
  }
}
