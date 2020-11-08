public class IllegalValueException extends RuntimeException
{
  public IllegalValueException()
  {
    super();
  }
  public IllegalValueException(String message)
  {
    super(message);
  }
  public String toString()
  {
    return "Illegal value '" + super.getMessage()
        + "' were found.";
  }
}
