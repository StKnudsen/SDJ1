import java.util.ArrayList;

public class CD
{
  private String title;
  private ArrayList<CDTrack> tracks;

  public CD(String title)
  {
    this.title = title;
    this.tracks = new ArrayList<>();
  }

  public void addTrack(CDTrack track)
  {
    tracks.add(track.copy());
  }

  public String getTitle()
  {
    return title;
  }

  public Time getDuration()
  {
    int timeInSeconds = 0;

    for (CDTrack track:tracks)
    {
      timeInSeconds += track.getLength().getTimeInSeconds();
    }

    return new Time(timeInSeconds);
  }

  public CDTrack getCDTrack(int trackNumber)
  {
    return
        new CDTrack(
            tracks.get(trackNumber - 1).getTitle(),
            tracks.get(trackNumber - 1).getArtist(),
            new Time(tracks.get(trackNumber - 1).getLength().getTimeInSeconds())
        );
  }

  public String toString()
  {
    String s;

    s = title + "\n";
    s += getDuration();

    for (int i = 0; i < tracks.size(); i++)
    {
      s += "\n" + tracks.get(i).toString();
    }

    return s;
  }
}
