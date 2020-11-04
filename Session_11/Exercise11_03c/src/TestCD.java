public class TestCD
{
  public static void main(String[] args)
  {
    CD album = new CD("Tin-Ananas IV");

    CDTrack track1 = new CDTrack("Tinanana", "Tin-Ananas", new Time(605));
    album.addTrack(track1);
    CDTrack track2 = new CDTrack("Ste-fan-fan", "Tin-Ananas", new Time(405));
    album.addTrack(track2);
    CDTrack track3 = new CDTrack("Lineal-al", "Tin-Ananas", new Time(505));
    album.addTrack(track3);

    System.out.println(album.getDuration());

    System.out.println(album);
  }
}
