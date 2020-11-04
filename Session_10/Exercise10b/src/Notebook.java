import java.util.ArrayList;

public class Notebook
{
  private ArrayList<PriorityNote> notes;

  public Notebook()
  {
    notes = new ArrayList<PriorityNote>();
  }

  public int getSize()
  {
    return notes.size();
  }

  public void addNote(PriorityNote note)
  {
    notes.add(note);
  }

  public void addNote(String note)
  {
    notes.add(new PriorityNote(note));
  }

  public void addHighPriorityNote(String note)
  {
    for (PriorityNote prio:notes)
    {
      if (prio.getNote().equalsIgnoreCase(note))
       prio.setHighPriority();
    }
  }

  public String getNote(int index)
  {
    return notes.get(index).copy().getNote();
  }

  public boolean isHighPriorityNote(int index)
  {
    return notes.get(index).isHighPriority();
  }

  public int indexOfMostImportantNote()
  {
    for (int i = 0; i < notes.size(); i++)
    {
      if (isHighPriorityNote(i))
      {
        return i;   // returns index of the first high priority note
      }
    }

    return -1; // didn't find any
  }

  public String getMostImportantNote()
  {
    if (indexOfMostImportantNote() >= 0)
      return notes.get(indexOfMostImportantNote()).getNote();
    return "";
  }

  public void removeNote(int index)
  {
    notes.remove(index);
  }

  public String toString()
  {
    String s = "";
    for (int i=0; i < notes.size(); i++)
    {
      s += "Note #" + (i+1) + ": " + notes.get(i);
      if (i < notes.size()-1)
      {
        s += "\n";
      }
    }
    return s;
  }
}
