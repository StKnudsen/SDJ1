public class Notebook
{
  private int numberOfNotes;
  private Note notes[];

  public Notebook(int maxNumberOfNotes)
  {
    notes = new Note[maxNumberOfNotes];
    numberOfNotes = 0;
  }

  public int getNumberOfNotes()
  {
    return numberOfNotes;
  }

  public Note getNote(int index)
  {
    return notes[index];
  }

  public String getMessage(int index)
  {
    return notes[index].getMessage();
  }

  public void addNote(Note note)
  {
    notes[numberOfNotes] = note;
    numberOfNotes++;
  }

  public void addNote(String message)
  {
    notes[numberOfNotes] = new Note(message);
    numberOfNotes++;
  }

  public void AddHighPriorityMessage(String message)
  {
    for (int i = 0; i < numberOfNotes; i++)
    {
      if (message.equalsIgnoreCase(notes[i].getMessage()))
        notes[i].setToHighPriority();
    }
  }

  public void removeNote(int index)
  {
    for (int i = index; i < numberOfNotes - 1; i++)
    {
      notes[i] = notes[i + 1];
    }
    notes[numberOfNotes - 1] = null; // clean up
    numberOfNotes--;
  }

  public Note[] getAllNotes()
  {
    Note[] allNotes = new Note[numberOfNotes];

    for (int i = 0; i < numberOfNotes; i++)
    {
      allNotes[i] = notes[i];
    }

    return allNotes;
  }

  public int getNumberOfHighNotes()
  {
    int count = 0;

    for (int i = 0; i < numberOfNotes; i++)
    {
      System.out.println(notes[i]);
      if (notes[i].isHighPriority())
        count++;
    }

    return count;
  }

  public Note[] getAllHighPriorityNotes()
  {
    int arrayIndex = 0;
    Note[] highPriorityNotes = new Note[getNumberOfHighNotes()];

    for (int i = 0; i < numberOfNotes; i++)
    {
      if (notes[i].isHighPriority())
      {
        highPriorityNotes[arrayIndex] = notes[i];
        arrayIndex++;
      }
    }

    return highPriorityNotes;
  }

  public String toString()
  {
    String s = "";
    for (int i=0; i<getNumberOfNotes(); i++)
    {
      s += "Note #" + (i+1) + ": " + notes[i];
      if (i < getNumberOfNotes()-1)
      {
        s += "\n";
      }
    }
    return s;
  }
}
