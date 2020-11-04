public class PriorityNote
{
  private String note;
  private boolean highPriority;

  public PriorityNote(String note)
  {
    this.note = note;
  }

  public String getNote()
  {
    return note;
  }

  public void setNote(String note)
  {
    this.note = note;
  }

  public boolean isHighPriority()
  {
    return highPriority;
  }

  public void setHighPriority()
  {
    this.highPriority = true;
  }

  public void setLowPriority()
  {
    this.highPriority = false;
  }

  public PriorityNote copy()
  {
    return new PriorityNote(note);
  }

  public String toString()
  {
    return note + (highPriority ? " >High priority<" : "");
  }
}
