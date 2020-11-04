public class Brain
{
  private String activeMemoryItem, passiveMemoryItemOne, passiveMemoryItemTwo;

  public Brain()
  {
    activeMemoryItem = "";
    passiveMemoryItemOne = "";
    passiveMemoryItemTwo = "";
  }

  public int getIQ()
  {
    int iq = 70;

    if (isBrainDamaged())
    {
      iq = 70;
    }
    else if ((activeMemoryItem.length() >= 10
        && passiveMemoryItemOne.length() >= 10 && passiveMemoryItemTwo.length() >= 10))
    {
      iq = 100;
      if ((activeMemoryItem.length() > 20 || passiveMemoryItemOne.length() > 20
          || passiveMemoryItemTwo.length() > 20) && (activeMemoryItem.length() > 10 && passiveMemoryItemOne.length() > 10
          && passiveMemoryItemTwo.length() > 10))
      {
        iq = 130;
      }
    }

    return iq;
  }

  public boolean isBrainDamaged()
  {
    if (activeMemoryItem == null || passiveMemoryItemOne == null || passiveMemoryItemTwo == null)
    {
      return true;
    }

    return false;
  }

  public void remember(String info)
  {
    passiveMemoryItemTwo = passiveMemoryItemOne;
    passiveMemoryItemOne = activeMemoryItem;
    activeMemoryItem = info;
  }

  public void refreshMemory(String info)
  {
    if (passiveMemoryItemOne.equalsIgnoreCase(info))
    {
      String brainFart = activeMemoryItem;
      activeMemoryItem = passiveMemoryItemOne;
      passiveMemoryItemOne = brainFart;
    }
    else if (passiveMemoryItemTwo.equalsIgnoreCase(info))
    {
      String brainFart = activeMemoryItem;
      activeMemoryItem = passiveMemoryItemTwo;
      passiveMemoryItemTwo = brainFart;
    }
  }

  public boolean recall(String info)
  {
    if (activeMemoryItem.equalsIgnoreCase(info) || passiveMemoryItemOne.equalsIgnoreCase(info) || passiveMemoryItemTwo.equalsIgnoreCase(info))
    {
      return true;
    }

    return false;
  }

  public String recall()
  {
    return activeMemoryItem;
  }

  @Override public String toString()
  {
    return "Brain{" + "active '" + activeMemoryItem + '\''
        + ", passive 1 '" + passiveMemoryItemOne + '\''
        + ", passive 2 '" + passiveMemoryItemTwo + '\'' + '}';
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Brain))
      return false;

    Brain compare = (Brain) obj;

    return activeMemoryItem.equals(compare.activeMemoryItem) && passiveMemoryItemOne.equals(compare.passiveMemoryItemOne) && passiveMemoryItemTwo.equals(compare.passiveMemoryItemTwo);
  }
}
