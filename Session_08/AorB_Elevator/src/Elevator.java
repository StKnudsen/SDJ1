public class Elevator
{
  /*
   *  Four instance variables; floor of type int, specifying the current floor
   *  the elevator is located at, capacity of type int, representing the
   *  maximum amount of persons allowed in the elevator at once,
   *  maximumLoad of type int, representing the maximum weight
   *  the elevator can carry, and currentLoad, representing
   *  the current weight the elevator currently carries.
   */
  private int floor, capacity, maximumLoad, currentLoad;

  /*
   *  A constructor with two arguments. The constructor should set the current
   *  floor and specify the capacity. The maximumLoad should be set, and
   *  can be calculated based on the capacity. Assume that a person
   *  weighs 75 kg. CurrentLoad should be initialized to 0.
   */
  public Elevator (int floor, int capacity)
  {
    this.floor = floor;
    this.capacity = capacity;
    this.maximumLoad = capacity * 75;
    this.currentLoad = 0;
  }

  /*
   *  Getters for all four instance variables
   */
  public int getFloor()
  {
    return floor;
  }

  public int getCapacity()
  {
    return capacity;
  }

  public int getMaximumLoad()
  {
    return maximumLoad;
  }

  public int getCurrentLoad()
  {
    return currentLoad;
  }

  /*
   *  A method personEnter() that models a person entering the elevator.
   *  Again, assume that a person weighs 75 kg. The method
   *  should update the currentLoad field
   */
  public void personEnter()
  {
    currentLoad += 75;
  }

  /*
   *  A method personEnter(int weight) that models a person with the weight
   *  given as argument is entering the elevator. The method should
   *  update the currentLoad field with the value given as argument.
   *  (bonus question: what is special about this method,
   *  in relation to the previous method?)
   */
  // Overloading -> more methods with the same name, remember,
  // must have different number of arguments
  public void personEnter(int weight)
  {
    currentLoad += weight;
  }

  /*
   *  A method personExit() that models a person leaving the
   *  elevator. Again, assume that a person weighs 75 kg.
   *  The method should update the currentLoad field.
   */
  public void personExit()
  {
    currentLoad -= 75;
  }

  /*
   *  A method personExit(int weight) that models a person with the weight
   *  given as argument is leaving the elevator. The method should update
   *  the currentLoad field with the value given as argument.
   *  (bonus question: what is special about this method,
   *  in relation to the previous method?)
   */
  // Overloading -> more methods with the same name, remember,
  // must have different number of arguments
  public void personExit(int weight)
  {
    currentLoad -= weight;
  }

  /*
   *  A method isAllowedToMove() that returns false if the elevator is
   *  currently over it’s maximum load, and true otherwise.
   */
  public boolean isAllowedToMove()
  {
    return currentLoad < maximumLoad;
  }

  /*
   *  A method moveToFloor(int floor) that moves the elevator to the floor
   *  given as argument. The method should only update the floor
   *  field if the elevator is allowed to move.
   *  Notice that the method has the return value boolean. This means that
   *  the method must return either true or false.
   *  If the elevator is allowed to move, and the floor field is
   *  updated, let the method return true.
   *  Otherwise, when the elevator is not allowed to move, and the
   *  floor thus doesn’t change, return false.
   */
  public boolean moveToFloor(int floor)
  {
    if (isAllowedToMove())
    {
      this.floor = floor;
      return true;
    }

    return false;
  }
}
