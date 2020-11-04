public class TestNotebook
{
  public static void main(String[] args)
  {
    /**
     *  Notes
     */
    Note note = new Note("Hello world!");
    Note copy = note.copy();

    note.setToHighPriority();
    copy.setMessage("This is the copy.");

    //System.out.println("Message: " + note);
    //System.out.println("Message: " + copy.getMessage());

    note.setToLowPriority();
    //System.out.println("Message: " + note);

    /**
     *  Notebook
     */
    Notebook notebook = new Notebook(5);
    notebook.addNote(note);
    notebook.addNote(copy);
    notebook.addNote("Best note EVER!!!");

    System.out.println(notebook.getNumberOfNotes());
    System.out.println(notebook.getNote(2));

    notebook.AddHighPriorityMessage("Best note EVER!!!");
    System.out.println(notebook.getMessage(2));

    notebook.removeNote(1);

    System.out.println(notebook.getAllNotes());
    System.out.println(notebook.getNumberOfHighNotes());
    System.out.println(notebook.getAllHighPriorityNotes());
  }
}
