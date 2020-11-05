public class Cow extends Animal
{
  private boolean hasSpots;

  public Cow(int speed, String name, boolean hasSpots)
  {
    super(speed, name);
    this.hasSpots = hasSpots;
  }

  public String makeAnimalSound()
  {
    return "Moooh";
  }
}
