import java.util.Scanner;

public class ElevatorTest
{
  public static void main(String[] args)
  {
    /**
     *  Create a class ElevatorTest that can read input from keyboard,
     *  and use this input to create an Elevator object.
     *  (bonus: use a loop to reject illegal input, such
     *  as a maximum capacity that is negative)
     *  Test your methods to make sure that they work. Pay special
     *  attention to the moveToFloor-method, and make sure that
     *  the elevator doesn’t move when it is over maximum load.
     */

    Scanner scanner = new Scanner(System.in);
    Elevator elevator;
    int floor, capacity;

    /**
     *  Receive a valid capacity for the elevator
     */
    String enterCapacity = "Enter capacity for the elevator: ";
    do
    {
      System.out.print(enterCapacity);
      capacity = scanner.nextInt();

      enterCapacity = "Invalid input, please enter a positive integer, 1 or above: ";
    } while (capacity <= 0);


    System.out.print("...and what is the starting floor? ");
    floor = scanner.nextInt();

    // instantiate the elevator
    elevator = new Elevator(floor, capacity);

    // Elevator play?
    while (true)
    {
      System.out.println(">> Press >>  0: exit  |  1: person enter  |  2: person exit  |  3: move elevator  |  42: status");
      int response = scanner.nextInt();
      if (response == 0)
      {
        break;
      }
      else if (response == 1) // Add a person
      {
        System.out.print("Enter a weight for this person (enter '0' if don't know): ");
        int weight = scanner.nextInt();

        if (weight == 0)
        {
          elevator.personEnter();
        }
        else if (weight < 0)
        {
          System.out.println("You seem to be an evil ghost, negativity isn't allowed! .. try again");
        }
        else if (weight > 5000)
        {
          System.out.println("Elephants doesn't fit THIS elevator! .. try again");
        }
        else if (weight > 200)
        {
          elevator.personEnter(weight);
          System.out.print("A bit heavy you are .. ");

          if (elevator.getMaximumLoad() > elevator.getCurrentLoad() + weight)
          {

            System.out.println("but okay.");
          }
          else
          {
            System.out.println("you may enter, but the elevator will now be stuck on this floor!");
          }
        }
        else
        {
          elevator.personEnter(weight);
          System.out.println("Person entered.");
        }
      }

      else if (response == 2) // Remove a person
      {
        System.out.print("Enter a weight for this person (enter '0' if don't know): ");
        int weight = scanner.nextInt();

        if (weight == 0)
        {
          elevator.personExit();
        }
        else if (weight < 0)
        {
          System.out.println("Bye bye evil ghost.");
        }
        else
        {
          if (weight <= elevator.getCurrentLoad())
          {
            elevator.personExit(weight);
            System.out.println("Bye for now, thank you for using this elevator!");
          }
          else
          {
            System.out.println("Trying to move more that the elevator load, not possible.. Try again");
          }
        }
      }
      else if (response == 3) // Move the elevator
      {
        if (!elevator.isAllowedToMove())
        {
          System.out.println("The elevator is currently at: " + elevator.getCurrentLoad() +
              " of a " + elevator.getCapacity() + " limit. Can't move!");
        }
        else
        {
          System.out.print("Enter the desired floor: ");
          int moveTo = scanner.nextInt();

          elevator.moveToFloor(moveTo);
          System.out.println("*DING*  ... elevator is now at floor " + elevator.getFloor());
        }
      }
      else if (response == 42)  // Elevator Status
      {
        int currentFloor = elevator.getFloor();
        int lastDigit = currentFloor%10;
        String floorText = "" + currentFloor;

        if (lastDigit == 1) {
          floorText += "st floor";
        }
        else if (lastDigit == 2)
        {
          floorText += "nd floor";
        }
        else if (lastDigit == 3)
        {
          floorText += "rd floor";
        }
        else
        {
          floorText += "th floor";
        }

        System.out.println("Elevator status:");
        System.out.println("  - Maximum load:   " + elevator.getMaximumLoad() + " kg.");
        System.out.println("  - Current load:   " + elevator.getCurrentLoad() + " kg.");
        System.out.println("  - Able to move:   " + elevator.isAllowedToMove());
        System.out.println("  - Current floor:  " + floorText);
      }
      else
      {
        System.out.print("Invalid input, try again .. ");
      }
    }

    elevator.personEnter();
    System.out.println(elevator.getCurrentLoad() + " of " + elevator.getMaximumLoad());
    System.out.println("Allowed to move? " + elevator.isAllowedToMove());
  }
}
