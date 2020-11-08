public class NoMatchingDetailsException extends RuntimeException
{
  public NoMatchingDetailsException()
  {
    super();
  }
  public NoMatchingDetailsException(String message)
  {
    super(message);
  }
  public String toString()
  {
    return "No details matching '" + super.getMessage()
        + "' were found.";
  }
}
