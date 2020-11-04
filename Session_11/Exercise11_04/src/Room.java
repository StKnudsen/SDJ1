public class Room
{
  private int number;
  private Guest guests[];
  private Bed bed;

  public Room(int number, String bedType)
  {
    this.number = number;
    this.bed = new Bed(bedType).copy();


    // Can we have one or more guests in room
    int guestLimit = 0;
    if (bed.isSingle())
      guestLimit = 1;
    if (bed.isDouble() || bed.isKingSize())
      guestLimit = 2;

    guests = new Guest[guestLimit];
  }

  public int getNumber()
  {
    return number;
  }

  public int getFloor()
  {
    return number/100;
  }

  public double getPrice()
  {
    double price = 0;
    if (bed.isSingle())
      price = 59.50;
    if (bed.isDouble())
      price = 72.40;
    if (bed.isKingSize())
      price = 89.00;
    return price;
  }

  public boolean isOccupied()
  {
    boolean occupied = false;

    if (guests.length == 1 && guests[0] != null)
      occupied = true;

    if (guests.length == 2 && guests[0] != null && guests[1] != null)
      occupied = true;

    return occupied;
  }

  public void registerGuest(Guest guest)
  {
    if (guests.length == 2 && guests[0] != null)
      guests[1] = guest;
    else
      guests[0] = guest;
  }

  public void vacate()
  {
    for (int i = 0; i < guests.length; i++)
    {
      guests[i] = null;
    }
  }

  public Bed getBedType()
  {
    return bed;
  }

  public Guest getGuest()
  {
    return guests[0];
  }

  public String getGuests()
  {
    String value = "";

    for (int i = 0; i < guests.length; i++)
    {
      if (guests[i] != null)
      {
        if (i == 0)
          value += guests[i];
        else
          value += " & " + guests[i];
      }
    }

    return value;
  }
}
