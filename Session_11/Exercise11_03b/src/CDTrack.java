public class CDTrack
{
  private String title, artist;
  private Time length;

  public CDTrack(String title, String artist, Time length)
  {
    this.title = title;
    this.artist = artist;
    this.length = new Time(length.getTimeInSeconds());
  }

  public String getTitle()
  {
    return title;
  }

  public String getArtist()
  {
    return artist;
  }

  public Time getLength()
  {
    return new Time(length.getTimeInSeconds());
  }

  public void setArtist(String artist)
  {
    this.artist = artist;
  }

  public String toString()
  {
    return artist + " " + title + " (" + length + ")";
  }

  public CDTrack copy()
  {
    return new CDTrack(title, artist, new Time(length.getTimeInSeconds()));
  }
}
