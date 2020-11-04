public class TestNotebook
{
  public static void main(String[] args)
  {
    PriorityNote note = new PriorityNote("Hej med dig.");

    Notebook notebook = new Notebook();

    notebook.addNote(note);
    notebook.addNote("Best note EVER!!!");
    notebook.addHighPriorityNote("Best note EVER!!!");

    System.out.println(notebook.getSize());

    System.out.println(notebook.getNote(1));

    System.out.println(notebook.isHighPriorityNote(0));
    System.out.println(notebook.isHighPriorityNote(1));

    System.out.println(notebook.indexOfMostImportantNote());
    System.out.println(notebook.getMostImportantNote());

    notebook.removeNote(0);
    System.out.println(notebook.getSize());

    System.out.println(notebook);
  }
}
