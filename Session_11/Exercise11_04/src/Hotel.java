import java.util.ArrayList;

public class Hotel
{
  private String name;
  private Room[] rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {
    int counter = 0;

    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
        counter++;
    }

    return counter;
  }

  public Room getFirstAvailableRoom()
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
        return rooms[i];
    }

    return null;
  }

  public Room getFirstAvailableRoom(double maxPrice)
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i].getPrice() <= maxPrice && !rooms[i].isOccupied())
        return rooms[i];
    }

    return null;
  }

  public Room[] getAllAvailableRooms(String bedType)
  {
    ArrayList<Room> roomsAL = new ArrayList<>();
    Room[] availableRooms;

    for (Room room:rooms)
    {
      if (bedType.equals(room.getBedType().toString()) && !room.isOccupied())
        roomsAL.add(room);
    }

    availableRooms = new Room[roomsAL.size()];

    for (int i = 0; i < roomsAL.size(); i++)
    {
      availableRooms[i] = roomsAL.get(i);
    }

    return availableRooms;
  }

  public boolean hasGuest(Guest guest)
  {
    for (Room room:rooms)
    {
      if (!(room.getGuest() == null) && room.getGuest().equals(guest))
        return true;
    }

    return false;
  }

  public Room getRoom(Guest guest)
  {
    for (Room room:rooms)
    {
      if (!(room.getGuest() == null) && room.getGuest().equals(guest))
        return room;
    }

    return null;
  }
}
