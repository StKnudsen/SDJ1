public class Bed
{
  private String type;

  public Bed(String type)
  {
    this.type = type;
  }

  public boolean isSingle()
  {
    return type.equalsIgnoreCase("Single");
  }

  public boolean isDouble()
  {
    return type.equalsIgnoreCase("Double");
  }

  public boolean isKingSize()
  {
    return type.equalsIgnoreCase("King Size");
  }
}
