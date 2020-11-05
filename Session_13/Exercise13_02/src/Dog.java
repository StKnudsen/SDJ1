public class Dog extends Animal
{
  private int dailyWalks;
  private int walksToday;

  public Dog(int speed, String name, int dailyWalks)
  {
    super(speed, name);
    this.dailyWalks = dailyWalks;
  }

  public String makeAnimalSound()
  {
    return "vuf";
  }

  public void walk()
  {
    super.moveTo(positionX+getSpeed(), positionY+getSpeed());

    if (walksToday < dailyWalks)
    {
      walksToday++;
    }
  }
}
