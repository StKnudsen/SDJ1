public class TestHotel
{
  public static void main(String[] args)
  {
    Guest guest = new Guest("John Doe");

    Room[] rooms = new Room[3];

    rooms[0] = new Room(401, "King Size");
    rooms[1] = new Room(402, "Double");
    rooms[2] = new Room(403, "Single");

    rooms[1].registerGuest(guest);

    Hotel hotel = new Hotel("Prison", rooms);

    System.out.println(hotel.getNumberOfRooms());
    System.out.println(hotel.getNumberOfAvailableRooms());

    System.out.println(hotel.getFirstAvailableRoom().getBedType());

    System.out.println(hotel.getFirstAvailableRoom(75).getBedType());

    System.out.println(hotel.getAllAvailableRooms("King Size").length);

    System.out.println(hotel.hasGuest(guest));

    System.out.println(hotel.getRoom(guest).getGuests());
  }
}
