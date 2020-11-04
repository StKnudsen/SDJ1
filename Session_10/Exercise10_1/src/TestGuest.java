public class TestGuest
{
  public static void main(String[] args)
  {
    // Create three guests
    Guest guest1 = new Guest("John Doe");
    Guest guest2 = new Guest("Jane Doe");
    Guest guest3 = new Guest("John Doe");

    // Get name
    System.out.println("Guest 1: " + guest1.getName());
    System.out.println("Guest 2: " + guest2.getName());

    // Equals
    System.out.println("Guest 1 equals guest 2: " + guest1.equals(guest2));
    System.out.println("Guest 1 equals guest 3: " + guest1.equals(guest3));
  }
}
